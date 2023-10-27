import java.util.Arrays;

public class Lesson_2 {
    public static void main(String[] args) {
        int[] arr1 = {0,1,1,0,0,1,0,1,1,1,1,0,0}; //6.
        for (int i = 0; i< arr1.length;i++){
            if(arr1[i]==0){
                arr1[i]=1;
            }
            else {
                arr1[i]=0;
            }
        }
        System.out.println(Arrays.toString(arr1));
        int[] arr2 = new int[100]; //7.
        for (int i = 0; i< arr2.length;i++){
            arr2[i]=i+1;
        }
        System.out.println(Arrays.toString(arr2));
        int[] arr3 = {1,5,3,2,11,4,5,2,4,8,9,1}; //8.
        for(int i =0;i< arr3.length;i++){
            if(arr3[i]<6){
                arr3[i]=arr3[i]*2;
            }
        }
        System.out.println(Arrays.toString(arr3));
        int [][] arr4=new int[5][5]; //10.
        for (int i=0;i<5;i++){
            arr4[i][i]=1;
            arr4[i][4-i]=1;
        }
        for (int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                System.out.print(arr4[i][j]+ " ");
            }
            System.out.println();
        }
    }
    static boolean sum10to20(int a,int b){ //1.
        return 10 <= a + b && 20 >= a + b;
    }
    static boolean sign(int a){  //2.
    return 0<=a;
    }
    static boolean sign2(int a){  //3.
        return 0>a;
    }
    static void txt(String txt,int b){ //4.
        for(int i =0;i<b;i++){
            System.out.println(txt);
        }
    }
    static boolean visokos(int year){ //5.
        boolean a= year % 4 == 0;
        if(year %100==0){
            a=false;
        }
        if(year %4==0 && year %100==0){
            a=true;
        }
        return a;
    }
    static int[] MyArr(int len,int initialValue){ //11.
      int[] myarray = new int[len];
      for (int i =0;i<len;i++){
          myarray[i]=initialValue;
      }
      return myarray;
    }
}
