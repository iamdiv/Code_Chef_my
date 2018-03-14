import java.util.*;
public class Puzzle{
public static void main(String[] args){
Scanner Scan = new Scanner(System.in);
int t = Scan.nextInt();
for(int k = 0 ;k<t; k++){
int arr[][] = {{0,1,0,1,1,0,0,0,0},{1,0,1,1,0,0,0,0,0},{0,1,0,0,1,1,0,0,0},{1,1,0,0,1,0,1,1,0},{1,1,1,1,0,1,1,1,1},{0,1,1,0,1,0,0,1,1},{0,0,0,1,1,0,0,1,0},{0,0,0,1,1,1,1,0,1},{0,0,0,0,1,1,0,1,0}};
int c,d;
 int arr1[] = new int[9];

int counter = 0;
for(int i = 0;i<9;i++){

    arr1[i] = Scan.nextInt();

}
for(int  i= 0;i<9;i++){

    System.out.print(arr1[i] + " ");
}
for(c = 0;c<9;c++){
    for(d = 0;d<9;d++){
         if(arr[c][d] == 1){
//c & d are connected 
             if(c < d && arr1[c] > arr1[d] || d < c && arr1[d] > arr1[c]){
                 if(isPrime(arr1[c] + arr1[d])){
                     int temp;
                     temp = arr1[c];
                     arr1[c] = arr1[d];
                     arr1[d] = temp;
                     counter++;
}
}
}
}
}
for(int i=0;i<9;i++){
    System.out.println(arr1[i]);
    
}
int f = 0;
for(int i = 0;i<9;i++){
if(arr1[i] == i+1){
f++;

}
}


if(f == 9){
System.out.print(" counter = " + counter);
}
else{
counter = -1;
System.out.print("Counter = " + counter);
}
}
}
 public static boolean isPrime(int number) {
        int sqrt = (int) Math.sqrt(number) + 1;
        for (int i = 2; i < sqrt; i++) {
            if (number % i == 0) {
                // number is perfectly divisible - no prime
                return false;
            }
        }
        return true;
    }




}
