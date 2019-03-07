import java.util.*;
class twod{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
int n;
n=scan.nextInt();
int arr[][]=new int[n][];
for(int i=0;i<arr.length;i++){
arr[i]=new int[i+1];
}
int i,j,k=0;
for(i=0;i<arr.length;i++){
for(j=0;j<i+1;j++){
arr[i][j]=k;
k++;
}
}
for(i=0;i<arr.length;i++){
for(j=0;j<i+1;j++){
System.out.print(arr[i][j]+" ");
}
System.out.println();
}
}
}
