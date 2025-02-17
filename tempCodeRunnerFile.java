        int b=a,c=a;
        int sum=0;
        int n=0;
        while(a>0)
        {
             int x=a%10;
                n++;
            a/=10;
        }
   int ans=0;
   while(b>0){
    int y=b%10;
    ans+=Math.pow(y,n);
    b/=10;
   }
   if (ans==c){
    System.out.println(c+" Armstrong  number"); //println used print in next line
    //print in same line if used only print
   }
   else{
    System.out.println(c+" Not armstrong number");
   }