import java.util.*;
class Main 
{    
 public static void main(String[] args)
 { 
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
    	int n=sc.nextInt();
        int x[]=new int[n];
        int y[]=new int[n];
        for(int i=0;i<n;i++)
        {
        	x[i]=sc.nextInt();
            y[i]=sc.nextInt();
        }
        int a=sc.nextInt();
        int b=sc.nextInt();
        int flag=0;
        for(int i=0;i<n;i++)
        {
            int d=Math.abs(x[i]-a)+Math.abs(y[i]-b);
            if(d==3)
            {
                flag=1;
                break;
            }
        }
        int flag1=0,flag2=0,flag3=0,flag4=0,flag5=0,flag6=0,flag7=0,flag8=0;
        if(flag==1)
        {
            int a1=a,b1=b;
            a=a-1;b=b-1;
            for(int i=0;i<n;i++)
            {
                int d=Math.abs(x[i]-a)+Math.abs(y[i]-b);
                if(d==3)
                {
                    flag1=1;
                    break;
                }
            }
            
            if(flag1==1)
            {
               a=a1;b=b1;
               a=a-1;
 
                for(int i=0;i<n;i++)
                {
                    int d=Math.abs(x[i]-a)+Math.abs(y[i]-b);
                    if(d==3)
                    {
                        flag2=1;
                        break;
                    }
                }
               

               if(flag2==1)
               {
                a=a1;b=b1;
                a=a-1;b=b+1;
                for(int i=0;i<n;i++)
                {
                    int d=Math.abs(x[i]-a)+Math.abs(y[i]-b);
                    if(d==3)
                    {
                        flag3=1;
                        break;
                    }
                }
                

                if(flag3==1)
                {
                    a=a1;b=b1;
                    b=b-1;
                
                        for(int i=0;i<n;i++)
                        {
                            int d=Math.abs(x[i]-a)+Math.abs(y[i]-b);
                            if(d==3)
                            {
                                flag4=1;
                                break;
                            }
                        }
                    

                    if(flag4==1)
                    {
                        a=a1;b=b1;
                        b=b+1;
                        for(int i=0;i<n;i++)
                        {
                            int d=Math.abs(x[i]-a)+Math.abs(y[i]-b);
                            if(d==3)
                            {
                                flag5=1;
                                break;
                            }
                        }

                        if(flag5==1)
                        {
                            a=a1;b=b1;
                            a=a+1;b=b-1;
                         
                                for(int i=0;i<n;i++)
                                {
                                    int d=Math.abs(x[i]-a)+Math.abs(y[i]-b);
                                    if(d==3)
                                    {
                                        flag6=1;
                                        break;
                                    }
                                }
                            

                            if(flag6==1)
                            {
                                a=a1;b=b1;
                                a=a+1;
                                for(int i=0;i<n;i++)
                                {
                                    int d=Math.abs(x[i]-a)+Math.abs(y[i]-b);
                                    if(d==3)
                                    {
                                        flag7=1;
                                        break;
                                    }
                                }

                                if(flag7==1)
                                {
                                    a=a1;b=b1;
                                    b=b+1;
                                    for(int i=0;i<n;i++)
                                    {
                                        int d=Math.abs(x[i]-a)+Math.abs(y[i]-b);
                                        if(d==3)
                                        {
                                            flag8=1;
                                            break;
                                        }
                                    }
                                    if(flag8==1)
                                    {
                                        System.out.println("YES");
                                    }
                                    else
                                    {
                                       System.out.println("NO"); 
                                    }
                                }
                                else
                                    {
                                       System.out.println("NO"); 
                                    }
                            }
                            else
                                    {
                                       System.out.println("NO"); 
                                    }
                        }
                        else
                                    {
                                       System.out.println("NO"); 
                                    }
                    }
                    else
                                    {
                                       System.out.println("NO"); 
                                    }
                }
                else
                                    {
                                       System.out.println("NO"); 
                                    }
               }
               else
                                    {
                                       System.out.println("NO"); 
                                    } 
            }
            else
                                    {
                                       System.out.println("NO"); 
                                    }
        

    }
    else
                                    {
                                       System.out.println("NO"); 
                                    }
}
}
}