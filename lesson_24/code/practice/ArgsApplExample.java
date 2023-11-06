package practice;

public class ArgsApplExample {
    public static void main(String[] args) {
        //String[] args- это массив типа String и названием args
        //в него можно передавать данные при старте программы из командной строки
        /*String str0= args[0];
        int num0= Integer.parseInt(str0);
        String str1= args[1];
        int num1= Integer.parseInt(str1);
        System.out.println(str0+" * "+str1+" = "+num0*num1);*/

        //Напишите приложение для вывода минимальных/максимальных числовых значений примитивных типов:
        // byte, short, char, int, long, float, double
        //Типы как объекты String должны браться из аргументов основной функции main.
        //Если в аргументах нет какого-либо типа, приложение должно вывести
        // максимальное/минимальное значения 7 типов (byte, int, short, long, char, float, double).
        //Если аргументы содержат неправильный тип, приложение должно вывести сообщение: Неверный тип.

        if (args.length==0){
            System.out.println("byte: max= "+Byte.MAX_VALUE+"; min= "+Byte.MIN_VALUE);
            System.out.println("short: max= "+Short.MAX_VALUE+"; min= "+Short.MIN_VALUE);
            System.out.println("char: max= "+Character.MAX_VALUE+"; min= "+Character.MIN_VALUE);
            System.out.println("int: max= "+Integer.MAX_VALUE+"; min= "+Integer.MIN_VALUE);
            System.out.println("long: max= "+Long.MAX_VALUE+"; min= "+Long.MIN_VALUE);
            System.out.println("float: max= "+Float.MAX_VALUE+"; min= "+Float.MIN_VALUE);
            System.out.println("double: max= "+Double.MAX_VALUE+"; min= "+Double.MIN_VALUE);
        }

        for (int i = 0; i < args.length; i++) {
            double max=0;
            double min=0;
            switch (args[i]) {
                case "byte": {
                    max = Byte.MAX_VALUE;
                    min = Byte.MIN_VALUE;
                    break;
                }
                case "short": {
                    max = Short.MAX_VALUE;
                    min = Short.MIN_VALUE;
                    break;
                }
                case "char": {
                    max = Character.MAX_VALUE;
                    min = Character.MIN_VALUE;
                    break;
                }
                case "int": {
                    max = Integer.MAX_VALUE;
                    min = Integer.MIN_VALUE;
                    break;
                }
                case "long": {
                    max = Long.MAX_VALUE;
                    min = Long.MIN_VALUE;
                    break;
                }
                case "float": {
                    max = Float.MAX_VALUE;
                    min = Float.MIN_VALUE;
                    break;
                }
                case "double": {
                    max = Double.MAX_VALUE;
                    min = Double.MIN_VALUE;
                    break;
                }
                default:
                    System.out.println("Wrong type!");
            }
            System.out.println(args[i]+": max= "+max+"; min= "+min);
        }
    }
}
