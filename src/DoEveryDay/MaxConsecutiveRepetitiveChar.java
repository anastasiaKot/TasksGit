package DoEveryDay;

public class MaxConsecutiveRepetitiveChar {

    public void maxConsecutiveRepetitiveChar() {
        String str = "fffffffeeegg";

        char maxChar = ' ';
        int maxCount = 0;

        char lastChar = ' ';
        int lastcharCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            if (currentChar == lastChar) {
                lastcharCount++;
            } else {
                if (lastChar == ' ') //this is only for the first one
                {
                    lastChar = currentChar;
                    lastcharCount = 1;
                } else {
                    if (lastcharCount > maxCount) {
                        // we have encountered a char that has more counts than
                        // the recorded MAX
                        maxCount = lastcharCount;
                        maxChar = lastChar;
                    } else {
                        // we have NOT encountered a char that has more counts than
                        // the recorded MAX, so nothing changes on the max tracking state
                    }

                    // regardless if we have encountered a new MAX -defined by the if statement above
                    // or NOT, we have encountered a new CHAR, meaning reset the lastChar and lastCharCount
                    lastChar = currentChar;
                    lastcharCount = 1;

                }
            }
        }
        if (lastcharCount > maxCount) {
            maxCount = lastcharCount;
            maxChar = lastChar;
        } else {
            /// no it is not bigger dot change it
        }

        System.out.println("char:" + maxChar + " has " + maxCount);

    }
}

//
//
//        String str = "fffffffffffffffffffeiiiooooosdgsg3ergsfshhfffffoooooooddffffff";
//        Map<Character, Integer> chCounts = new HashMap<Character, Integer>();
//
//        for(int i=0; i<str.length(); i++){
//            if(chCounts.containsKey(str.charAt(i))){
//                chCounts.put(str.charAt(i), chCounts.get(str.charAt(i))+1);
//            } else {
//                chCounts.put(str.charAt(i), 1);
//            }
//        }
//
//        int max=0;
//        char cha = ' ';
//        Iterator iterator = chCounts.entrySet().iterator();
//
//        for (Character ch : chCounts.keySet()) {
//            if(chCounts.get(ch) >= max){
//                max = chCounts.get(ch);
//                cha = ch;
//            }
//
//        }
//        System.out.println("char:" +cha +" has " +max);
//   }
//
//    public void maxConsecutiveRepetitiveChar() {
//
//        String str = "ffffffffddddddddddgggghiiiiiiiiiiiiiiiiii";
//        char ch=' ';
//        int n=1;
//        int max=0;
//        for (int i=0; i<str.length(); i++){
//            if( i <str.length()-1 && str.charAt(i) == str.charAt(i+1)){
//                n++;
//            } else {
//                if(n>max){
//                    ch = str.charAt(i);
//                    max = n;
//                    n=1;
//                }
//            }
//        }
//        System.out.println("char:" +ch +" has " +max);
//
//
//
//    }
//
//}
