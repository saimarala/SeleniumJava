package day5;

public class ArrayDemoPart8 {
    public static void main(String[] args) {
        Object  [][] names={
                {"Java","JS"},{"Python","Ruby"}
        };

       // System.out.println(names[0][0]);
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names.length; j++) {
                System.out.println(names[i][j]);

            }

        }

        Object obj[]={1,"Java",'t'};

        String str="This Price is 100 USD";
        String str1=str.split(" ")[3];
        System.out.println(str1);

        String [] s=str.split(" ");
        String str2="                  ";
        System.out.println(str2.isBlank());
        System.out.println(str.isEmpty());


    }
}
