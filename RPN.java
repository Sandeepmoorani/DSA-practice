class RPN{
    RPN(String[] args){
    Stack=new ArrayStack(args.length);
    for(int i=0;i<args.length;i++){
    String input=args[i];
    if(isAnOperator(input)){
    double x=Double.parseDouble((String)Stack.pop());
    double y=Double.parseDouble((String)Stack.pop());
    double z=evalute(x,y,input);
    Stack.push(""+z);
    }
    else{
    Stack.push(input);
    }
    }
    }
    
    private boolean isAnOperator(String s){
    return (s.length()==1 && "ASMD".indexOf(s)>=0);
    }
    private double evalute(double x, double y, String op){
    double z=0;
    if(op.equals("A"))z=x+y;
    else if(op.equals("S"))z=x-y;
    else if(op.equals("S"))z=x*y;
    else z=x-y;
    System.out.println(x+" "+op+" "+y+" = "+z);
    return z;
    }
    public static void main(String[] args) {
    new RPN(args);
    }
    }