public class Main {

    void insertion(int l,int num[]){
        for(int i = 0 ; i<l-1; i++){
            for(int j = i+1; j>0 ;j--){
                if(num[j-1] < num[j]){
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        for (int s = 0; s<l;s++){
            System.out.println(num[s]);
        }
        }


    public static void main(String[] args) {
        int num[] = {3,5,3,2,1,8,};
        int l = num.length;
        for(int i = 0; i<l;i++){
            for(int j = i; j<l;j++){
                if(num[i] < num[j]){
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }

                }

            }

        for(int k = 0; k<l; k++){
//            System.out.println(num[k]);








        }

        Main insertion  = new Main();
        insertion.insertion(l,num);





    }
}