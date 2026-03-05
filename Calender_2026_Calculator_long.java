import java.util.Scanner;
public class Calender_2026_Calculator
{
    public static void main(String[] args)
    {
        try (Scanner read = new Scanner(System.in))
        {
        while(true)
            {
                System.out.println("Hello");
                System.out.println("Welcome to 2026 Calander");
                System.out.println();
                System.out.println("Enter month (1-12)");
                int month=read.nextInt();
                System.out.println();
                System.out.println("Enter date");
                int date=read.nextInt();
                read.nextLine();
                System.out.println();
                //january
                if (month==1)
                {
                    if(date>0 && date<=31)
                    {
                        int a=1;
                        while(a<=31)
                        {
                            if(a==date)
                            {
                                System.out.println("Day = Thursday");
                            }
                            a+=7;
                        }
                        int b=2;
                        while(b<=31)
                        {
                            if(b==date)
                            {
                                System.out.println("Day = Friday");
                            }
                            b+=7;
                        }
                        int c=3;
                        while(c<=31)
                        {
                            if(c==date)
                            {
                                System.out.println("Day = Saturday");
                            }
                            c+=7;
                        }
                        int d=4;
                        while(d<=31)
                        {
                            if(d==date)
                            {
                                System.out.println("Day = Sunday");
                            }
                            d+=7;
                        }
                        int e=5;
                        while(e<=31)
                        {
                            if(e==date)
                            {
                                System.out.println("Day = Monday");
                            }
                            e+=7;
                        }
                        int f=6;
                        while(f<=31)
                        {
                            if(f==date)
                            {
                                System.out.println("Day = Tuesday");
                            }
                            f+=7;
                        }
                        int g=7;
                        while(g<=31)
                        {
                            if(g==date)
                            {
                                System.out.println("Day = Wednesday");
                            }
                            g+=7;
                        }
                        System.out.println();
                    }
                    else
                    {
                        System.out.println("Maximum days in January are 31");
                        System.out.println();
                    }
                }
                //february
                else if (month==2)
                {
                    if(date>0 && date<=28)
                    {
                        int a=1;
                        while(a<=28)
                        {
                            if(a==date)
                            {
                                System.out.println("Day = Sunday");
                            }
                            a+=7;
                        }
                        int b=2;
                        while(b<=28)
                        {
                            if(b==date)
                            {
                                System.out.println("Day = Monday");
                            }
                            b+=7;
                        }
                        int c=3;
                        while(c<=28)
                        {
                            if(c==date)
                            {
                                System.out.println("Day = Tuesday");
                            }
                            c+=7;
                        }
                        int d=4;
                        while(d<=28)
                        {
                            if(d==date)
                            {
                                System.out.println("Day = Wednesday");
                            }
                            d+=7;
                        }
                        int e=5;
                        while(e<=28)
                        {
                            if(e==date)
                            {
                                System.out.println("Day = Thursday");
                            }
                            e+=7;
                        }
                        int f=6;
                        while(f<=28)
                        {
                            if(f==date)
                            {
                                System.out.println("Day = Friday");
                            }
                            f+=7;
                        }
                        int g=7;
                        while(g<=28)
                        {
                            if(g==date)
                            {
                                System.out.println("Day = Saturday");
                            }
                            g+=7;
                        }
                        System.out.println();
                    }
                    else
                    {
                        System.out.println("Maximum days in February are 28");
                        System.out.println();
                    }
                }
                //march
                else if (month==3)
                {
                    if(date>0 && date<=31)
                    {
                        int a=1;
                        while(a<=31)
                        {
                            if(a==date)
                            {
                                System.out.println("Day = Sunday");
                            }
                            a+=7;
                        }
                        int b=2;
                        while(b<=31)
                        {
                            if(b==date)
                            {
                                System.out.println("Day = Monday");
                            }
                            b+=7;
                        }
                        int c=3;
                        while(c<=31)
                        {
                            if(c==date)
                            {
                                System.out.println("Day = Tuesday");
                            }
                            c+=7;
                        }
                        int d=4;
                        while(d<=31)
                        {
                            if(d==date)
                            {
                                System.out.println("Day = Wednesday");
                            }
                            d+=7;
                        }
                        int e=5;
                        while(e<=31)
                        {
                            if(e==date)
                            {
                                System.out.println("Day = Thursday");
                            }
                            e+=7;
                        }
                        int f=6;
                        while(f<=31)
                        {
                            if(f==date)
                            {
                                System.out.println("Day = Friday");
                            }
                            f+=7;
                        }
                        int g=7;
                        while(g<=31)
                        {
                            if(g==date)
                            {
                                System.out.println("Day = Saturday");
                            }
                            g+=7;
                        }
                        System.out.println();
                    }
                    else
                    {
                        System.out.println("Maximum days in March are 31");
                        System.out.println();
                    }
                }
                //april
                else if (month==4)
                {
                    if(date>0 && date<=30)
                    {
                        int a=1;
                        while(a<=30)
                        {
                            if(a==date)
                            {
                                System.out.println("Day = Wednesday");
                            }
                            a+=7;
                        }
                        int b=2;
                        while(b<=30)
                        {
                            if(b==date)
                            {
                                System.out.println("Day = Thursday");
                            }
                            b+=7;
                        }
                        int c=3;
                        while(c<=30)
                        {
                            if(c==date)
                            {
                                System.out.println("Day = Friday");
                            }
                            c+=7;
                        }
                        int d=4;
                        while(d<=30)
                        {
                            if(d==date)
                            {
                                System.out.println("Day = Saturday");
                            }
                            d+=7;
                        }
                        int e=5;
                        while(e<=30)
                        {
                            if(e==date)
                            {
                                System.out.println("Day = Sunday");
                            }
                            e+=7;
                        }
                        int f=6;
                        while(f<=30)
                        {
                            if(f==date)
                            {
                                System.out.println("Day = Monday");
                            }
                            f+=7;
                        }
                        int g=7;
                        while(g<=30)
                        {
                            if(g==date)
                            {
                                System.out.println("Day = Tuesday");
                            }
                            g+=7;
                        }
                        System.out.println();
                    }
                    else
                    {
                        System.out.println("Maximum days in April are 30");
                        System.out.println();
                    }
                }
                //may
                else if (month==5)
                {
                    if(date>0 && date<=31)
                    {
                        int a=1;
                        while(a<=31)
                        {
                            if(a==date)
                            {
                                System.out.println("Day = Friday");
                            }
                            a+=7;
                        }
                        int b=2;
                        while(b<=31)
                        {
                            if(b==date)
                            {
                                System.out.println("Day = Saturday");
                            }
                            b+=7;
                        }
                        int c=3;
                        while(c<=31)
                        {
                            if(c==date)
                            {
                                System.out.println("Day = Sunday");
                            }
                            c+=7;
                        }
                        int d=4;
                        while(d<=31)
                        {
                            if(d==date)
                            {
                                System.out.println("Day = Monday");
                            }
                            d+=7;
                        }
                        int e=5;
                        while(e<=31)
                        {
                            if(e==date)
                            {
                                System.out.println("Day = Tuesday");
                            }
                            e+=7;
                        }
                        int f=6;
                        while(f<=31)
                        {
                            if(f==date)
                            {
                                System.out.println("Day = Wednesday");
                            }
                            f+=7;
                        }
                        int g=7;
                        while(g<=31)
                        {
                            if(g==date)
                            {
                                System.out.println("Day = Thursday");
                            }
                            g+=7;
                        }
                        System.out.println();
                    }
                    else
                    {
                        System.out.println("Maximum days in May are 31");
                        System.out.println();
                    }
                }
                //june
                else if (month==6)
                {
                    if(date>0 && date<=30)
                    {
                        int a=1;
                        while(a<=30)
                        {
                            if(a==date)
                            {
                                System.out.println("Day = Monday");
                            }
                            a+=7;
                        }
                        int b=2;
                        while(b<=30)
                        {
                            if(b==date)
                            {
                                System.out.println("Day = Tuesday");
                            }
                            b+=7;
                        }
                        int c=3;
                        while(c<=30)
                        {
                            if(c==date)
                            {
                                System.out.println("Day = Wednesday");
                            }
                            c+=7;
                        }
                        int d=4;
                        while(d<=30)
                        {
                            if(d==date)
                            {
                                System.out.println("Day = Thursday");
                            }
                            d+=7;
                        }
                        int e=5;
                        while(e<=30)
                        {
                            if(e==date)
                            {
                                System.out.println("Day = Friday");
                            }
                            e+=7;
                        }
                        int f=6;
                        while(f<=30)
                        {
                            if(f==date)
                            {
                                System.out.println("Day = Saturday");
                            }
                            f+=7;
                        }
                        int g=7;
                        while(g<=30)
                        {
                            if(g==date)
                            {
                                System.out.println("Day = Sunday");
                            }
                            g+=7;
                        }
                        System.out.println();
                    }
                    else
                    {
                        System.out.println("Maximum days in June are 30");
                        System.out.println();
                    }
                }
                //july
                else if (month==7)
                {
                    if(date>0 && date<=31)
                    {
                        int a=1;
                        while(a<=31)
                        {
                            if(a==date)
                            {
                                System.out.println("Day = Wednesday");
                            }
                            a+=7;
                        }
                        int b=2;
                        while(b<=31)
                        {
                            if(b==date)
                            {
                                System.out.println("Day = Thursday");
                            }
                            b+=7;
                        }
                        int c=3;
                        while(c<=31)
                        {
                            if(c==date)
                            {
                                System.out.println("Day = Friday");
                            }
                            c+=7;
                        }
                        int d=4;
                        while(d<=31)
                        {
                            if(d==date)
                            {
                                System.out.println("Day = Saturday");
                            }
                            d+=7;
                        }
                        int e=5;
                        while(e<=31)
                        {
                            if(e==date)
                            {
                                System.out.println("Day = Sunday");
                            }
                            e+=7;
                        }
                        int f=6;
                        while(f<=31)
                        {
                            if(f==date)
                            {
                                System.out.println("Day = Monday");
                            }
                            f+=7;
                        }
                        int g=7;
                        while(g<=31)
                        {
                            if(g==date)
                            {
                                System.out.println("Day = Tuesday");
                            }
                            g+=7;
                        }
                        System.out.println();
                    }
                    else
                    {
                        System.out.println("Maximum days in July are 31");
                        System.out.println();
                    }
                }
                //august
                else if (month==8)
                {
                    if(date>0 && date<=31)
                    {
                        int a=1;
                        while(a<=31)
                        {
                            if(a==date)
                            {
                                System.out.println("Day = Saturday");
                            }
                            a+=7;
                        }
                        int b=2;
                        while(b<=31)
                        {
                            if(b==date)
                            {
                                System.out.println("Day = Sunday");
                            }
                            b+=7;
                        }
                        int c=3;
                        while(c<=31)
                        {
                            if(c==date)
                            {
                                System.out.println("Day = Monday");
                            }
                            c+=7;
                        }
                        int d=4;
                        while(d<=31)
                        {
                            if(d==date)
                            {
                                System.out.println("Day = Tuesday");
                            }
                            d+=7;
                        }
                        int e=5;
                        while(e<=31)
                        {
                            if(e==date)
                            {
                                System.out.println("Day = Wednesday");
                            }
                            e+=7;
                        }
                        int f=6;
                        while(f<=31)
                        {
                            if(f==date)
                            {
                                System.out.println("Day = Thursday");
                            }
                            f+=7;
                        }
                        int g=7;
                        while(g<=31)
                        {
                            if(g==date)
                            {
                                System.out.println("Day = Friday");
                            }
                            g+=7;
                        }
                        System.out.println();
                    }
                    else
                    {
                        System.out.println("Maximum days in August are 31");
                        System.out.println();
                    }
                }
                //september
                else if (month==9)
                {
                    if(date>0 && date<=30)
                    {
                        int a=1;
                        while(a<=30)
                        {
                            if(a==date)
                            {
                                System.out.println("Day = Tuesday");
                            }
                            a+=7;
                        }
                        int b=2;
                        while(b<=30)
                        {
                            if(b==date)
                            {
                                System.out.println("Day = Wednesday");
                            }
                            b+=7;
                        }
                        int c=3;
                        while(c<=30)
                        {
                            if(c==date)
                            {
                                System.out.println("Day = Thursday");
                            }
                            c+=7;
                        }
                        int d=4;
                        while(d<=30)
                        {
                            if(d==date)
                            {
                                System.out.println("Day = Friday");
                            }
                            d+=7;
                        }
                        int e=5;
                        while(e<=30)
                        {
                            if(e==date)
                            {
                                System.out.println("Day = Saturday");
                            }
                            e+=7;
                        }
                        int f=6;
                        while(f<=30)
                        {
                            if(f==date)
                            {
                                System.out.println("Day = Sunday");
                            }
                            f+=7;
                        }
                        int g=7;
                        while(g<=30)
                        {
                            if(g==date)
                            {
                                System.out.println("Day = Monday");
                            }
                            g+=7;
                        }
                        System.out.println();
                    }
                    else
                    {
                        System.out.println("Maximum days in September are 30");
                        System.out.println();
                    }
                }
                //october
                else if (month==10)
                {
                    if(date>0 && date<=31)
                    {
                        int a=1;
                        while(a<=31)
                        {
                            if(a==date)
                            {
                                System.out.println("Day = Thursday");
                            }
                            a+=7;
                        }
                        int b=2;
                        while(b<=31)
                        {
                            if(b==date)
                            {
                                System.out.println("Day = Friday");
                            }
                            b+=7;
                        }
                        int c=3;
                        while(c<=31)
                        {
                            if(c==date)
                            {
                                System.out.println("Day = Saturday");
                            }
                            c+=7;
                        }
                        int d=4;
                        while(d<=31)
                        {
                            if(d==date)
                            {
                                System.out.println("Day = Sunday");
                            }
                            d+=7;
                        }
                        int e=5;
                        while(e<=31)
                        {
                            if(e==date)
                            {
                                System.out.println("Day = Monday");
                            }
                            e+=7;
                        }
                        int f=6;
                        while(f<=31)
                        {
                            if(f==date)
                            {
                                System.out.println("Day = Tuesday");
                            }
                            f+=7;
                        }
                        int g=7;
                        while(g<=31)
                        {
                            if(g==date)
                            {
                                System.out.println("Day = Wednesday");
                            }
                            g+=7;
                        }
                        System.out.println();
                    }
                    else
                    {
                        System.out.println("Maximum days in October are 31");
                        System.out.println();
                    }
                }
                //november
                else if (month==11)
                {
                    if(date>0 && date<=30)
                    {
                        int a=1;
                        while(a<=30)
                        {
                            if(a==date)
                            {
                                System.out.println("Day = Sunday");
                            }
                            a+=7;
                        }
                        int b=2;
                        while(b<=30)
                        {
                            if(b==date)
                            {
                                System.out.println("Day = Monday");
                            }
                            b+=7;
                        }
                        int c=3;
                        while(c<=30)
                        {
                            if(c==date)
                            {
                                System.out.println("Day = Tuesday");
                            }
                            c+=7;
                        }
                        int d=4;
                        while(d<=30)
                        {
                            if(d==date)
                            {
                                System.out.println("Day = Wednesday");
                            }
                            d+=7;
                        }
                        int e=5;
                        while(e<=30)
                        {
                            if(e==date)
                            {
                                System.out.println("Day = Thursday");
                            }
                            e+=7;
                        }
                        int f=6;
                        while(f<=30)
                        {
                            if(f==date)
                            {
                                System.out.println("Day = Friday");
                            }
                            f+=7;
                        }
                        int g=7;
                        while(g<=30)
                        {
                            if(g==date)
                            {
                                System.out.println("Day = Saturday");
                            }
                            g+=7;
                        }
                        System.out.println();
                    }
                    else
                    {
                        System.out.println("Maximum days in November are 30");
                        System.out.println();
                    }
                }
                //december
                else if (month==12)
                {
                    if(date>0 && date<=31)
                    {
                        int a=1;
                        while(a<=31)
                        {
                            if(a==date)
                            {
                                System.out.println("Day = Tuesday");
                            }
                            a+=7;
                        }
                        int b=2;
                        while(b<=31)
                        {
                            if(b==date)
                            {
                                System.out.println("Day = Wednesday");
                            }
                            b+=7;
                        }
                        int c=3;
                        while(c<=31)
                        {
                            if(c==date)
                            {
                                System.out.println("Day = Thursday");
                            }
                            c+=7;
                        }
                        int d=4;
                        while(d<=31)
                        {
                            if(d==date)
                            {
                                System.out.println("Day = Friday");
                            }
                            d+=7;
                        }
                        int e=5;
                        while(e<=31)
                        {
                            if(e==date)
                            {
                                System.out.println("Day = Saturday");
                            }
                            e+=7;
                        }
                        int f=6;
                        while(f<=31)
                        {
                            if(f==date)
                            {
                                System.out.println("Day = Sunday");
                            }
                            f+=7;
                        }
                        int g=7;
                        while(g<=31)
                        {
                            if(g==date)
                            {
                                System.out.println("Day = Monday");
                            }
                            g+=7;
                        }
                        System.out.println();
                    }
                    else
                    {
                        System.out.println("Maximum days in December are 31");
                        System.out.println();
                    }
                }
                else if(month<1 || month>12)
                {
                    System.out.println("There are only 12 months in a year");
                    System.out.println();
                }
            System.out.println("If you want to leave calculator type exit");
            String ans=read.nextLine();
            if(ans.equalsIgnoreCase("exit"))
            {
                System.out.println();
                System.out.println("Thank you");
                System.out.println("Bye");
                break;
            }
            System.out.println();
            }
        }
    }
}
