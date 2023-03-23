import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scc= new Scanner(System.in);
        System.out.print("any string");
        String str=scc.nextLine();
        System.out.println("\nENTER THE KEY:");
        int key =scc.nextInt();
        String encrypted = encrypt(str,key);
        System.out.println("\n Encrypted strying is:"+encrypted);
        String decrypted= decrypt(str,key);
        System.out.println("\n decrypted string is:"+decrypted);




    }
           public static String encrypt(String str, int key){
               String encryptd="" ;

               for (int i=0;i<str.length();i++){
                   int c=str.charAt(i);
                   if(Character.isUpperCase(c)) {
                       c = c + (key % 26);
                       if (c > 'z')
                           c = c - 26;
                   }
                   else if(Character.isLowerCase(c)){
                       c = c + (key % 26);
                       if(c > 'z')
                           c = c - 26;
                   }
                   encryptd +=(char)c ;

               }
               return encryptd;
           }
    static public String decrypt(String message, int key ){
        String decrypted ="";
        int c;
        for(int i = 0; i < message.length(); i++){
            c = message.charAt(i);
            if(Character.isUpperCase(c)){
                c = c - (key % 26);
                if(c < 'A')
                    c = c + 26;
            }
            else if(Character.isLowerCase(c)){
                c = c - (key % 26);
                if(c < 'a')
                    c = c +26;
            }
            decrypted += (char)c;
        }
        return decrypted;
    }


                   }


