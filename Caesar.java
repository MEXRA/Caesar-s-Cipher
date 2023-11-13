class Caesar {
    public static char rotate(int shift, char charr){
         if(shift > 26){
             shift = shift%26;
         }
         else if(shift < 0){
             shift = (shift%26) + 26;
         }
        return charr;
    }


    public static String rotate(int shift, String Text){
        String message = "";
        int length = Text.length();
        for(int i = 0; i < length; i++){
            char ch = Text.charAt(i);
            if(Character.isLetter(ch)){
                if(Character.isLowerCase(ch)){
                    char c = (char)(ch + shift);
                    if(c <='z'){
                        message += (char)(ch + shift);
                    }
                    else{
                        c = (char)(c - 26);
                        message += c;
                    }
                }
                else if (Character.isUpperCase(ch)){
                    char c = (char)(ch + shift);
                    if(c <= 'Z'){
                        message += (char)(ch + shift);
                    }
                    else{
                        c = (char)(c-26);
                        message += c;
                    }

                }
            }
            else{
                message += ch;
            }
            
        }
        

        return message;


    }





         public static void main(String[] args){
             int shift =  Integer.parseInt(args[0]);
             String plainText = args[1];
             String x = rotate(shift, plainText);
             System.out.println(rotate(shift, plainText));







         }

    }
