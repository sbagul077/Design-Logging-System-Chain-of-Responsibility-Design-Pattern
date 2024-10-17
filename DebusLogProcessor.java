package LLChainofResponsibilityDesignPattern;

public class DebusLogProcessor extends LogProcessor{

    DebusLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    public void log(int logLevel, String message){
        if(logLevel == DEBUG){
            System.out.println("DEBUG: " + message);
        }else{
            super.log(logLevel, message);
        }
    }
}
