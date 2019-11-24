import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Main main = new Main();
//        main.AreaOfCircle();
//        main.AreaOfTriangle();
//        main.AreaOfRectangle();
//        main.PerimeterOfCircle();
//        main.Factoral();
//        main.CGPA();
//        main.Average();
//        main.NumberAdd();
//        main.ArmStrong();
//        main.AcsendNumber();
//
        main.ReverseArray();
//        Matrixes
//        main.MatrixTranpose();
//        main.MatrixMultiple();
//        main.MatrixAddition();
//        main.MatrixMinus();
//        main.MatrixDivision();

    }


    private void ReverseArray(){
        int n, res,i,j=0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of elements in the array:");
        n = s.nextInt();

        int[] array = new int[n];
        int[] rev = new int[n];

        System.out.println("Enter "+n+" elements ");
        for( i=0; i < n; i++){
            array[i] = s.nextInt();
        }
        System.out.println("Reverse of an array is :");
        for( i=n; i>0 ; i-- , j++){

            rev[j] = array[i-1];
            System.out.println(rev[j]);
        }
    }
    private void MatrixDivision(){
        int row, col,i,j;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of rows");
        row = in.nextInt();

        System.out.println("Enter the number  columns");
        col  = in.nextInt();

        int[][] mat1 = new int[row][col];
        int[][] mat2 = new int[row][col];
        int[][] res = new int[row][col];

        System.out.println("Enter the elements of matrix1");
        for (  i= 0 ; i < row ; i++ ) {
            for ( j= 0 ; j < col ;j++ ){
                mat1[i][j] = in.nextInt();
            }
        }
        System.out.println("Enter the elements of  matrix2");
        for (  i= 0 ; i < row ; i++ ) {
            for ( j= 0 ; j < col ;j++ ){
                mat2[i][j] = in.nextInt();
            }
        }

        for (  i= 0 ; i < row ; i++ ){
            for ( j= 0 ; j < col ;j++ ){
                res[i][j] =  mat1[i][j] / mat2[i][j]  ;
            }
        }
        System.out.println("subtract  of  two matrices:-");

        for (  i= 0 ; i < row ; i++ ) {
            for ( j= 0 ; j < col ;j++ ){
                System.out.print(res[i][j]+"\t");
            }
            System.out.println();
        }
    }
    private void MatrixMinus(){
        int row, col,i,j;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of rows");
        row = in.nextInt();

        System.out.println("Enter the number  columns");
        col  = in.nextInt();

        int[][] mat1 = new int[row][col];
        int[][] mat2 = new int[row][col];
        int[][] res = new int[row][col];

        System.out.println("Enter the elements of matrix1");
        for (  i= 0 ; i < row ; i++ ) {
            for ( j= 0 ; j < col ;j++ ){
                mat1[i][j] = in.nextInt();
            }
        }
        System.out.println("Enter the elements of  matrix2");
        for (  i= 0 ; i < row ; i++ ) {
            for ( j= 0 ; j < col ;j++ ){
                mat2[i][j] = in.nextInt();
            }
        }

        for (  i= 0 ; i < row ; i++ ){
            for ( j= 0 ; j < col ;j++ ){
                res[i][j] =  mat1[i][j] - mat2[i][j]  ;
            }
        }
        System.out.println("subtract  of  two matrices:-");

        for (  i= 0 ; i < row ; i++ ) {
            for ( j= 0 ; j < col ;j++ ){
                System.out.print(res[i][j]+"\t");
            }
            System.out.println();
        }
    }

    private void MatrixAddition(){
        int row, col,i,j;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of rows");
        row = in.nextInt();

        System.out.println("Enter the number columns");
        col = in.nextInt();
        int[][] mat1 = new int[row][col];
        int[][] mat2 = new int[row][col];
        int[][] res = new int[row][col];

    System.out.println("Enter the elements of matrix1");

    for ( i= 0 ; i < row ; i++ ) {
        for ( j= 0 ; j < col ;j++ ){
            mat1[i][j] = in.nextInt();
        }
        System.out.println();
    }
    System.out.println("Enter the elements of matrix2");

    for ( i= 0 ; i < row ; i++ ) {
        for ( j= 0 ; j < col ;j++ ){
            mat2[i][j] = in.nextInt();
        }
        System.out.println();
    }
    for ( i= 0 ; i < row ; i++ ){
        for ( j= 0 ; j < col ;j++ ){
            res[i][j] = mat1[i][j] + mat2[i][j] ;
        }
    }

    System.out.println("Sum of matrices:-");

    for ( i= 0 ; i < row ; i++ ) {
        for ( j= 0 ; j < col ;j++ ){
            System.out.print(res[i][j]+"\t");
        }
        System.out.println();
    }

}


    private void MatrixMultiple(){
        int r1, r2,c1,c2,i,j,k,sum;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of rows of matrix1");
        r1 = in.nextInt();

        System.out.println("Enter the number columns of matrix 1");
        c1 = in.nextInt();
        System.out.println("Enter the number of rows of matrix2");
        r2 = in.nextInt();

        System.out.println("Enter the number of columns of matrix 2");
        c2 = in.nextInt();

        if(c1==r2) {
            int[][] mat1 = new int[r1][c1];
            int[][] mat2 = new int[r2][c2];
            int[][] res = new int[r1][c2];

            System.out.println("Enter the elements of matrix1");

            for ( i= 0 ; i < r1 ; i++ ) {
                for ( j= 0 ; j < c1 ;j++ ){
                    mat1[i][j] = in.nextInt();
                }
            }
            System.out.println("Enter the elements of matrix2");

            for ( i= 0 ; i < r2 ; i++ ) {
                for ( j= 0 ; j < c2 ;j++ ){
                    mat2[i][j] = in.nextInt();
                }
            }

            System.out.println("\n\noutput matrix:-");
            for ( i= 0 ; i < r1 ; i++ ){
                for ( j= 0 ; j <c2;j++) {
                    sum=0;
                    for ( k= 0 ; k <r2;k++ ) {
                        sum +=mat1[i][k]*mat2[k][j] ;
                    }
                    res[i][j]=sum;
                }
              }
            for ( i= 0 ; i < r1; i++ ) {
                for ( j=0 ; j < c2;j++ ){
                    System.out.print(res[i][j]+" ");
                }
                System.out.println();
            }
        }
        else
            System.out.print("multipication does not exist ");
    }

    private void MatrixTranpose(){
        int row, col,i,j,temp,n;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        row = in.nextInt();

        System.out.println("Enter the number  columns");
        col  = in.nextInt();
        if(row >col)
            n=row;
        else
            n= col;

        int mat1[][] = new int[n][n];

        System.out.println("Enter the elements of matrix");

        for (  i= 0 ; i < row ; i++ ) {
            for ( j= 0 ; j < col ;j++ ){
                mat1[i][j] = in.nextInt();
            }
        }

        System.out.println("\n\nOriginal   matrix:-");
        for (  i= 0 ; i < row ; i++ ) {
            for ( j= 0 ; j <col;j++ ){
                System.out.print(mat1[i][j]+" ");
            }
            System.out.println();
        }

        for (  i= 0 ; i < n; i++ )
            for ( j= i+1 ; j < n;j++ ) {

                temp=mat1[i][j]  ;
                mat1[i][j] =mat1[j][i]  ;
                mat1[j][i]  =temp;

            }
        System.out.println("Transpose  of   matrix:-");
        for (  i= 0 ; i < col ; i++ ) {
            for ( j= 0 ; j < row;j++ ){
                System.out.print(mat1[i][j]+" ");
            }
            System.out.println();
        }

    }

    private void AcsendNumber(){
        int count, temp;

        //User inputs the array size
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of elements you want in the array: ");
        count = scan.nextInt();

        int num[] = new int[count];
        System.out.println("Enter array elements:");

        for (int i = 0; i < count; i++) {
            num[i] = scan.nextInt();
        }
        scan.close();
        for (int i = 0; i < count; i++) {
            for (int j = i + 1; j < count; j++) {
                if (num[i] > num[j]) {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        System.out.print("Array Elements in Ascending Order: ");
        for (int i = 0; i < count - 1; i++) {
            System.out.print(num[i] + ", ");
        }
        System.out.print(num[count - 1]);

    }

    private void ArmStrong(){

        int number = 371, originalNumber, remainder, result = 0;
        originalNumber = number;
        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }
        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else {
            System.out.println(number + " is not an Armstrong number.");
        }

    }

    private void NumberAdd(){
        int n,sum=0;

        Scanner sc=new Scanner(System.in);

        System.out.println("enter how many numbers you want sum");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the "+n+" numbers ");
        for(int i=0;i<n;i++)
        {
            System.out.println("enter  number  "+(i+1)+":");
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            sum+=a[i];
        }
        System.out.println("sum of "+n+" numbers is ="+sum);
    }

    private void AreaOfCircle(){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the radius:");
        double r= s.nextDouble();
        //PI r2
        double PI = 3.14159;
        double area = PI *r*r;
        System.out.println("Area of Circle is: " + area);
    }

    private void AreaOfTriangle(){
        Scanner s= new Scanner(System.in);

        System.out.println("Enter the width of the Triangle:");
        double b= s.nextDouble();

        System.out.println("Enter the height of the Triangle:");
        double h= s.nextDouble();

        //Area = (width*height)/2
        double area=(b*h)/2;
        System.out.println("Area of Triangle is: " + area);
    }

    private void AreaOfRectangle(){

        Scanner s= new Scanner(System.in);
        System.out.println("Enter the length:");
        double l= s.nextDouble();
        System.out.println("Enter the breadth:");
        double b= s.nextDouble();
        double  area=l*b;
        System.out.println("Area of Rectangle is: " + area);

    }

    private void PerimeterOfCircle(){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the radius:");
        double r= s.nextDouble();
        double PI = 3.14;
        double  c=(PI*2*r) ;
        System.out.println("Perimeter of Circle is: " +c);
    }


    private void Factoral(){
        long n,fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        n=sc.nextLong();
        for(int i=1;i<=n;i++) {
            fact=fact*i;
        }
        System.out.println("fact="+fact);
    }

    private void CGPA(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of subjects");
        int n=sc.nextInt();
        double[] marks=new double[n];
        System.out.println("Enter marks");
        for(int i=0;i<n;i++) {
            marks[i]=sc.nextInt();
        }

        double[] grade = new double[n];

        double cgpa,sum=0;
        for(int i=0;i<n;i++) {
            grade[i]=(marks[i]/10) ;
        }

        for(int i=0;i<n;i++) {
            sum+=grade[i];
        }
        cgpa=sum/n;
        System.out.println("cgpa="+cgpa);
        System.out.println("percantage from cgpa="+cgpa*9.5);
    }

    private void Average(){
        int i;

        System.out.println("Enter number of subjects");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        double avg=0;
        System.out.println("Enter marks");
        for( i=0;i<n;i++) {
            a[i]=sc.nextInt();
        }
        for( i=0;i<n;i++) {
            avg=avg+a[i];
        }
        System.out.print("Average of (");
        for(i=0;i<n-1;i++) {
            System.out.print(a[i]+",");
        }
        System.out.println(a[i]+") ="+avg/n);
    }
}
