package lesson03;

public class StringLearning {
    public static void main(String[] args) {
        // String declaration and compare 2 Strings
//        String s1 = "cat"; // String pool
//        String s2 = "cat";
//        String s3 = new String("cat");
//        System.out.printf("is S1 equals S2: %b\n",(s1==s2));
//        System.out.printf("is S1 equals S3: %b\n",(s1==s3));
//        System.out.printf("is S1 equals S3: %b",s3.equals(s1));

        // Check lower, uppercase, digit...
        String myPasswordStr = "123myPassword";
        String wrongPasswordFormatStr = "1234r567";
        char[] allCharacters = wrongPasswordFormatStr.toCharArray();
        int totalUpperCase = 0;
        int totalLowerCase = 0;
        int totalDigit = 0;

        for (int i = 0; i < allCharacters.length; i++) {
            char character = allCharacters[i];
            if (Character.isDigit(character))
                totalDigit++;
            if (Character.isLowerCase(character))
                totalLowerCase++;
            if (Character.isUpperCase(character))
                totalUpperCase++;
        }
        if(totalDigit == 0 || totalLowerCase == 0 || totalUpperCase == 0){
            System.out.println("Password is not correct format...");
        } else {
            System.out.println("OK!!!\n");
        }
        System.out.println("Upper Case: "+totalUpperCase);
        System.out.println("Upper Case: "+totalUpperCase);
        System.out.println("Upper Case: "+totalUpperCase);

        // Replacement
        // fuck => ****

        String badWordsContainer ="bad something else...bad2.asdbad.. ";
        String filterStr = badWordsContainer.replace("bad","***");
        String filterStrFirst = badWordsContainer.replaceFirst("bad","***");
        String filterStrAll = badWordsContainer.replaceAll("bad","***");
        System.out.println(filterStr);
        System.out.println(filterStrAll);

        // Trim | remove empty spaces at beginning and ending
        String withEmptySpaceStr =" abc ";
        System.out.printf("Arr lenght: %d\n", withEmptySpaceStr.length());
        String newStringWithoutSpaces = withEmptySpaceStr.trim();
        System.out.println(newStringWithoutSpaces);
        System.out.println(withEmptySpaceStr.length());
        System.out.println("======================\n");

        // Substring, indexOf. . .. split
        String url = "https://google.com";

        // Character
        System.out.println(url.indexOf("m"));
        System.out.println(url.indexOf("r"));

        // Sub-str
        System.out.println(url.indexOf("google"));
        String myName = "Teo Huynh";
        System.out.println(myName.substring(0,3));

        // Split
        for (String s: url.split("://")) {
            System.out.println(s);
        }

        // simple Regex
        String myCookTimes = " 105 mins         ";
        // Tat ca [] nhung cai gi khong thuoc (^) (0-9)
        String myCookTimeStr = myCookTimes.replaceAll("[^0-9]","");
        System.out.println(myCookTimeStr);
        int myCookTimeNum = Integer.parseInt(myCookTimeStr);
        System.out.println((myCookTimeNum + 1));

        // Concat | StringBuilder
        String str1 = "Hello";
        String str2 = "world";

        String CompleteGreetingStr = str1 + str2;
        String CompleteGreetingStr2 = str1.concat(str2);
        System.out.println(CompleteGreetingStr);
        System.out.println(CompleteGreetingStr2);

    }
}
