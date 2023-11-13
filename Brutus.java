public class Brutus {
    public static final double[] english = {
        0.0855, 0.0160, 0.0316, 0.0387, 0.1210, 0.0218, 0.0209, 0.0496, 0.0733,
        0.0022, 0.0081, 0.0421, 0.0253, 0.0717, 0.0747, 0.0207, 0.0010, 0.0633,
        0.0673, 0.0894, 0.0268, 0.0106, 0.0183, 0.0019, 0.0172, 0.0011
    };
    public static int[] count (String text){

        int[] letterCounts = new int[26];

        for (int i = 0; i < letterCounts.length; i++){

            letterCounts[i] = 0;
        }


char character = ' ';

        String lowercase = text.toLowerCase();

        for (int i = 0; i < lowercase.length(); i++){

            character = lowercase.charAt(i);

            switch (character){

                case 'a':
                    letterCounts[0]++;
                    break;
                case 'b':
                    letterCounts[1]++;
                    break;
                case 'c':
                    letterCounts[2]++;
                    break;
                case 'd':
                    letterCounts[3]++;
                    break;
                case 'e':
                    letterCounts[4]++;
                    break;
                case 'f':
                    letterCounts[5]++;
                    break;
                case 'g':
                    letterCounts[6]++;
                    break;
                case 'h':
                    letterCounts[7]++;
                    break;
                case 'i':
                    letterCounts[8]++;
                    break;
                case 'j':
                    letterCounts[9]++;
                    break;
                case 'k':
                    letterCounts[10]++;
                    break;
                case 'l':
                    letterCounts[11]++;
                    break;
                case 'm':
                    letterCounts[12]++;
                    break;
                case 'n':
                    letterCounts[13]++;
                    break;
                case 'o':
                    letterCounts[14]++;
                    break;
                case 'p':
                    letterCounts[15]++;
                    break;
                case 'q':
                    letterCounts[16]++;
                    break;
                case 'r':
                    letterCounts[17]++;
                    break;
                case 's':
                    letterCounts[18]++;
                    break;
                case 't':
                    letterCounts[19]++;
                    break;
                case 'u':
                    letterCounts[20]++;
                    break;
                case 'v':
                    letterCounts[21]++;
                    break;
                case 'w':
                    letterCounts[22]++;
                    break;
                case 'x':
                    letterCounts[23]++;
                    break;
                case 'y':
                    letterCounts[24]++;
                    break;
                case 'z':
                    letterCounts[25]++;
                    break;
                case ' ':
                    break;
            }
        }

        return letterCounts;
    }
        //2--------------------
        public static double[] frequency(String text){
            int [] letterCounts= count(text);
            double[] letterFreq = new double[26];
            for(int i = 0; i<letterCounts.length; i++){
                letterFreq[i] = (double) letterCounts[i]/text.length();

            }

            return letterFreq;
        }
        //3-------------------
        public static double chiSquared(double[] freq, double[] english){
            double chi = 0;
            for(int i = 0; i < 26; i++){
               chi = chi + Math.pow(freq[i] - english[i],2 ) / english[i];



            }
            return chi;
        }


        //4----------------------
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


        //------
        public static void main(String[] args){
        String CipherText = args[0];
        int[] count = count(CipherText);
        double[] freqq = frequency(CipherText);
        char letter = 'a';

        for(int i = 0; i < count.length; i++){
           // System.out.println(letter+" -> "+count[i]+" (frequency is "+ freqq[i]+")");
            letter++;

        }
        double[] chi = new double[26];
        for(int b = 0; b < 26; b++){
        String rotated = rotate(b, CipherText);
        double [] freq = frequency(rotated);
        chi[b] = chiSquared( freq,  english);
          }
          double min;
          int i;
            int index;
		min = chi[0];
		index = 0;
		i = 1;
		while (i < chi.length) {
			if (chi[i] < min)
				min = chi[i];
				index = i;
			i++;
          //(minimym bulcaz x = x(kaç kere döndürücem) = )
    }
             String x = rotate(index, CipherText);
             System.out.println(rotate(index, CipherText));
        }
}

