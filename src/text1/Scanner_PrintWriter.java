package text1;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Scanner_PrintWriter {
    public static void main(String[] args) throws FileNotFoundException {
        //创建一个"input.txt的文件"
        java.io.File file = new java.io.File("src/text1/input.txt");
        java.io.File file1 = new java.io.File("src/text1/output.txt");
        //给"input.txt"输入内容

        try(java.io.PrintWriter output = new java.io.PrintWriter(file)){
            output.println("Hello World!");
            output.print("114514");
        }
        Scanner input = new Scanner(file);
        try (java.io.PrintWriter output1 = new java.io.PrintWriter(file1);){
            while(input.hasNext()){
                String x = input.nextLine();
                output1.println(x);
                System.out.println(x);
            }
        }

        input.close();
    }
}
