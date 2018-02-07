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
//      vseraznue();



//l_5_2();
     //  l_5_3();
      //  l_5_4();
       // l_5_7();
igra();

    }



    public static void igra()
    {
        Scanner scaner1 = new Scanner(System.in); //создание обьекта позволяющий считать входную информа
        System.out.println("вы зашли в игру крестики нолики");
        System.out.println("Введите имя Первого игрока ");
        String igrok_1 =scaner1.next();
        System.out.println("Поздравляем, " +igrok_1+", Ваш символ - 'Х' ");
        System.out.println("Введите имя Второго  игрока ");
                String igrok_2 =scaner1.next();
        System.out.println("Поздравляем, "+igrok_2+", Ваш символ - 'O' ");
int count=1;
        char [][] array = new char[3][3];
        for (int i =0; i<array.length;i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (char)(count+'0');//
             count +=1;
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        String winer="no";
        boolean number=true;
        char simbol = 'O';
        while (winer=="no")
        {
            String tekushiy_igrok="";
            if(number)
            {
            System.out.println(igrok_1 + " выбирете следующее положение");simbol='X';tekushiy_igrok=igrok_1;}
            else {
                System.out.println(igrok_2 + " выбирете следующее положение");simbol='O';tekushiy_igrok=igrok_2;
            }
//boolean vvod=false;
//            do {
//                try {count = scaner1.nextInt();                }
//                catch (java.util.InputMismatchException e)
//                {
//                    System.out.println("Вы ввели что угодно, но не целое число!");
//                    vvod=true;
//                }
//            }
//                while (vvod);
            count = scaner1.nextInt();



boolean target=true;

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    if ((char) (count + '0') == array[i][j]){
                        array[i][j] = simbol;target=false;}

                    System.out.print(array[i][j] + "\t");
                }
                System.out.println();
            }
             if (target)
            {System.out.println("ERROR повторите ввод");
                continue;}
            number= !number;
            int dia=0;
            int dia2=0;
            for (int i = 0; i < array.length; i++)
            {
                int gor = 0;
                int ver = 0;

                for (int j = 0; j < array.length; j++)
                {
                    if (array[i][j] == simbol)
                         gor+=1;
                    if (array[j][i] == simbol)
                         ver+=1;
                    if (i==j&&array[i][j] == simbol)
                         dia+=1;
                    if (i+j== array.length-1&&array[i][j] == simbol)
                        dia2+=1;


                }

                if (gor==3||ver==3)
                {
                    System.out.println(tekushiy_igrok + " WINER!!!!!" );winer="yes";

                }
                else
                {gor=0; ver=0;}

            }
            if (dia==3||dia2==3)
            {
                System.out.println(tekushiy_igrok + " WINER!!!!!" );winer="yes";

            }
            else
            {dia=0; dia2=0;}




        }






    }
    public static void proverka_win()//генерация масива

    {


    }

    public static void l_5_7()//генерация масива

    {


        Scanner scaner1 = new Scanner(System.in); //создание обьекта позволяющий считать входную информа
        System.out.println("Введите размер квадратного масива = ");
        int dlinna = scaner1.nextInt();
        int [][] array = new int[dlinna][dlinna];
        int sum=0;
        //генерируем масив
        for (int i =0; i<array.length;i++)
        {  for (int j=0 ; j<array.length; j++)
        {
            array[i][j]=generator_(10, 99);
            System.out.print(array[i][j]+"\t");

        }
            System.out.println("");
        }

        System.out.println(""); System.out.println("");

        int tmp=0;
        for (int i =0; i<array.length;i++)
        {  for (int j=0 ; j<array.length-1; j=+2)
        {
            tmp=array[i][j];
            array[i][j]=array[i+1][j];
            array[i+1][j]=tmp;
           System.out.print(array[i][j]+"\t");

        }
            System.out.println("");
        }



        System.out.print("\tсумма = "+sum);
    }

    public static void  l_5_4()

    {
        Scanner scaner1 = new Scanner(System.in); //создание обьекта позволяющий считать входную информа
        System.out.println("Введите размер квадратного масива = ");
        int dlinna = scaner1.nextInt();
        int [][] array = new int[dlinna][dlinna];
        int sumstroka=0;
        int sumstolbec=0;
        int xmax=0;
        int ymax=0;
int tmpmax=0;
int tmpmax2=0;
        //генерируем масив
        for (int i =0; i<array.length;i++)
        {  for (int j=0 ; j<array.length; j++)
        {
            array[i][j]=generator_(1, 10);
            System.out.print(array[i][j]+"\t");

        }
            System.out.println("");
        }
        int j = 0;
        int i=0;
        for (i =0; i<array.length;i++)
        {
            for (j = 0; j < array.length; j++)
            {
                tmpmax += array[i][j];
                tmpmax2 += array[j][i];
            }

        if (tmpmax>sumstroka){sumstroka=tmpmax;ymax=i;}
        if (tmpmax2>sumstolbec){sumstolbec=tmpmax2; xmax=i;}
        tmpmax=0;
            tmpmax2=0;


        }
        System.out.println(" ymax = "+ ymax);
        System.out.println(" xmax = "+ xmax);


    }
    public static int  generator_(int x,int y ) // x-генерировать число от заданого числа  y-генерировать число от заданого числа
    {
            int rand;

                rand=((int)(Math.random() * (y-x) +x));

            return rand;


    }
    public static void l_5_2()//генерация масива

    {


        Scanner scaner1 = new Scanner(System.in); //создание обьекта позволяющий считать входную информа
        System.out.println("Введите размер квадратного масива = ");
        int dlinna = scaner1.nextInt();
        int [][] array = new int[dlinna][dlinna];
        int sum=0;
        //генерируем масив
        for (int i =0; i<array.length;i++)
        {  for (int j=0 ; j<array.length; j++)
        {
array[i][j]=generator_(10, 99);
            System.out.print(array[i][j]+"\t");
           if (i==j) sum+=array[i][j];
        }
            System.out.println("");
        }
        System.out.print("\tсумма = "+sum);
    }
    public static void l_5_3()//определение максимального и минимального згначения

    {


        Scanner scaner1 = new Scanner(System.in); //создание обьекта позволяющий считать входную информа
        System.out.println("Введите размер квадратного масива = ");
        int dlinna = scaner1.nextInt();
        int [][] array = new int[dlinna][dlinna];
        int tmpmin=0;
        int tmpmax=0;
        int xmin=0;
        int ymin=0;
        int xmax=0;
        int ymax=0;

        //генерируем масив
        for (int i =0; i<array.length;i++)
        {


            for (int j=0 ; j<array.length; j++)
        {

            array[i][j]=generator_(-10, 99);
            if (i==0){
                tmpmin=array[0][0];
                tmpmax=array[0][0];
            }
            System.out.print(array[i][j]+"\t");
            if (array[i][j]<tmpmin)
            {
                tmpmin=array[i][j];
                xmin=i;
                ymin=j;

            }
            else
                if (array[i][j]>tmpmax)
            {
                tmpmax=array[i][j];
                xmax=i;
                ymax=j;
            }
        }
            System.out.println("");
        }
        System.out.println("\tMAX = "+tmpmax +" ["+xmax+"] [ "+ymax+"]");
        System.out.print("\tMIN = "+tmpmin +" ["+xmin+"] [ "+ymin+"]");

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

    private static class SomeException {
    }
}



