import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        //one();
        //two();
        //thre();
        //fore();
        //   five();
        //six();
        // seven();
    //nine();// библиотека\
      //sport();
    //  konki();
     // posledovatchisla();
    //prostoe();

       vseraznue();

    }
    public static void vseraznue() {
        Scanner scaner1 = new Scanner(System.in); //создание обьекта позволяющий считать входную информа
        System.out.println("Програама гененрирует масив, а после изменяет в нем такиеже элементы, то есть все элементы масива не равны друг другу");
        System.out.println("Введите длину масива = ");
int count=0;
        int dlinna = scaner1.nextInt();
        int[] maize = massive_zadannuy_promezhutok(dlinna, 4, 99).clone();

        for (int i=0; i<maize.length;i++) {
            for (int j=i+1; j<maize.length;j++)
                if(maize[j]==maize[i])
                {
                    maize[j]=randint();
                    count+=1;
                    i=0;
                }

        }
        for (int i=0; i<maize.length;i++)
        {
            System.out.print(maize[i]+", ");
        }

        System.out.println("\nЧисла не 2-х значные те которые программа заменила ");
        System.out.println("количество замен включая повторные = "+ count);
    }


    public static void prostoe() {
        Scanner scaner1 = new Scanner(System.in); //создание обьекта позволяющий считать входную информа
        System.out.println("Програама выводит простые числа из масива");
        System.out.println("Введите длину масива = ");

        int dlinna = scaner1.nextInt();
        int[] maize = massive_zadannuy_promezhutok(dlinna, 4, 27).clone();
        for (int i = 0; i < maize.length; i++) {
            if (isPrime(maize[i])) {
                System.out.println("Индекс i =" + i + "\tчисло = " + maize[i]);
            }

        }
    }

    public static boolean isPrime(int num) //определения простого числа
    {
        boolean flag = true;
        for (int j = 2; j < num; j++) {
            if (num % j == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }



    public static void posledovatchisla()
    {
        Scanner vvod = new Scanner(System.in);

        Scanner scaner1 = new Scanner(System.in); //создание обьекта позволяющий считать входную информа
        System.out.println("Привет  это програмка программу определения в одномерном массиве вещественных\n" +
                "        чисел наибольшего количества последовательно расположенных\n" +
                "        положительных чисел.");
        System.out.println("Введите длину масива = ");
        int dlinna = scaner1.nextInt();
        int[] maize = massive_zadannuy_promezhutok(dlinna, 4,900).clone();
       int index1=0;
       int index2=0;
        int counter=0;
        int tmpindex1=0;
        int tmpindex2=0;
        int tmpcounter=0;
       for (int i=0; i<maize.length-1;i++)
       {
           if(maize[i+1]>maize[i]) {
               tmpindex2 = i + 1;
               tmpcounter+=1;
           }
           else
           {

               if (tmpcounter>counter) {
                 //  System.out.println(tmpcounter);
                   counter = tmpcounter;
                   index1= tmpindex1;
                   index2 = tmpindex2;
               }
               tmpindex1=i+1;
               tmpcounter=0;
           }
       }
        //System.out.println(index1);
       // System.out.println(index2);
      //  for (int i=0; i<maize.length;i++)
           // System.out.print(maize[i]+", ");
        System.out.println();
        for (int i=index1; i<=index2;i++)
            System.out.print(maize[i]+", ");





    }
    public static  void konki()
    {

        Scanner vvod = new Scanner(System.in);
        int summ =0;//общее количество балов
        Scanner scaner1 = new Scanner(System.in); //создание обьекта позволяющий считать входную информа
        System.out.println("Привет  это програмка позволит узнать в какой программе спортсмен лучше выступил");

        int ball = 0;
        String discuplina="Основная";

        int[] result = massive_zadannuy_promezhutok(18, 4,11).clone();
        System.out.println("резултьтаты спортсмена за каждую дисциплину ");
        int tempsumm =0;
        System.out.println("#" + "\t"+"ball"+"    Summ");
        for (int i=0; i<18;i++)
        {
            tempsumm+=result[i];
            System.out.println( i + "\t"+result[i]+"\t\t"+tempsumm);// выводим бал за дисциплину и общую сумму после сдачи очередной дисциплины


            if(i==5||i==11||i==17)
            {
                if(tempsumm>summ&&i==5)
                {summ=tempsumm;
                discuplina="основная";
                }
                if(tempsumm>summ&&i==11)
                {summ=tempsumm;
                discuplina="короткая";
                }
                if(tempsumm>summ&&i==17)
                {summ=tempsumm;
                    discuplina="произвольная";
                }

                tempsumm=0;
            }
        }
        System.out.println("сумма за дисциплину "+ discuplina+" = "+summ );
       }




    public static  void sport() {

        Scanner vvod = new Scanner(System.in);
        int summ =0;//общее количество балов
        Scanner scaner1 = new Scanner(System.in); //создание обьекта позволяющий считать входную информа
        System.out.println("Привет  это програмка позволит узнать прошол ли спортсмен отбор");
        System.out.println("Введите прохобной бал = ");
        int ball = scaner1.nextInt();
        int[] result = massive_zadannuy_promezhutok(10, 4,11).clone();
        System.out.println("резултьтаты спортсмена за каждое единоборство ");

        for (int i:result)
        {
            summ+=i;
            System.out.println(i+"\t"+summ);// выводим бал за дисциплину и общую сумму после сдачи очередной дисциплины

        }
        if (summ>ball){System.out.println("Прошел!!!");}
        else System.out.println("не прошел");


    }

    public static  void nine() {
        Scanner vvod = new Scanner(System.in);
        int summ =0;//общее количество книг в бтиблиотеке
        Scanner scaner1 = new Scanner(System.in); //создание обьекта позволяющий считать входную информа
        System.out.println("Привет  это програмка позволит узнать общее число книг");
        System.out.println("Введите количество разделов в библиотеке Разделов = ");
        int razdelov = scaner1.nextInt();
        int[] bili = massive(razdelov).clone();

        System.out.println("Книг в разделе библиотек ");
        System.out.println("раздел [ 10 ] = "+bili[10]);
        int u=1;
        for (int i:bili)
        {
            System.out.println("раздел [ "+u+" ] = "+ i);
            summ+=i;
            u+=1 ;
             }
             if (summ>1000000)
             {
                 System.out.println("Общее количество более 1000000 и равно "+summ);

             }
             else System.out.println("Общее количество менее 1000000 и равно "+ summ);

    }

    static  int randint (){
        int array=((int)Math.abs((Math.random() * 1000) ));

        return array;

    }
    static  int[] massive (int i)
    {

        int[] array = new int[i];
        for (int a =0; a<i;a++)
        {
            array[a]=((int)Math.abs((Math.random() * 12) +375885));
        }
        return array;
    }
    static  int[] massive_zadannuy_promezhutok (int i,int x,int y )// генератор одномерного масива (к-во элементов,  начало промежутка значение, конец промежутка значения )
    {

        int[] array = new int[i];
        for (int a =0; a<i;a++)
        {
            array[a]=((int)(Math.random() * (y-x) +x));
        }

        return array;
    }






////////////////////////////////////
//////////////////////////////////

    public static void six()

    {
        int raz=10;

        int[] num =  massive(raz).clone();
        int[] numTemp= num.clone();
        for (int i=0; i<=num.length; i++)
        {
            while (i != 1 && i % 2 == 0) ;
            {i/=2;}
            while (numTemp[i]!=1&& numTemp[i]%2==0);
            {numTemp[i]/=2;}

            if (numTemp[i]==1||i==1)
            {  System.out.println("значение индекса i = "+i+"=" +num[i]);}

        }
    }





    public static void one()
    {
        int a=123456789;
        //int b =9;
        for(int counter=9;counter<=81;counter+=9)
        {
            System.out.println("result = "+counter*a);
        }
    }

    public static void two ()
    {
        int a=7;
        //int b =9;
        for(int counter=1;counter<=10;counter+=1)
        {
            System.out.println("7 x "+counter+" = "+counter*a);


        }
    }
    public static void thre ()
    {
        int a=7;
        //int b =9;
        for(int counter=2;counter<=20;counter+=1)
        {
            System.out.println("sin"+counter+" = "+Math.sin(counter));
        }
    }

    public static void fore ()
    {
        double a=3;
        double summ=0;
        //int b =9;
        boolean z=false;
        for(double counter=1;counter<=13;counter=counter+2)
        {
            if (z==false) // if(!z)
            {
                summ = summ + (Math.pow(a, counter) / fac(counter));
                z=true;
            }
            else
            {  summ=summ-(Math.pow(a,counter)/fac(counter));
                z=false;
            }
        }
        System.out.println("Result = "+ summ);
    }
    private  static double fac(double x)
    {

        int fact=1;
        for (int i=2; i<=x;i++) // на 1 умножать смысла нет, начинаем с 2. Умножаем, пока i<= числу, для которого
            fact*=i;            // вычисляется факториал. fact*=i это сокращение для fact=fact*i
        return fact;        // возвращаем методу значение факториала, который мы только что вычислили
    }

    private  static  void five()
    {
        Scanner vvod =new Scanner(System.in);
        System.out.println("Введите заначение шага");
        int x =vvod.nextInt();
        System.out.println("Введите заначение начала");
        int a =vvod.nextInt();
        System.out.println("Введите заначение окончания");
        int b =vvod.nextInt();
        for(int i=a;i<=b;i+=x)
            System.out.println("F("+i+") = " +Math.tan(i)+ "\t F("+i+") = " +(1+1/Math.tan(i)) );

    }

}



