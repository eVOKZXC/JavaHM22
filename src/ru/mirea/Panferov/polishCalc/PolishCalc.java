package ru.mirea.Panferov.polishCalc;

public class PolishCalc {
    Stack stack;
    String[] userDataNums;

    public PolishCalc(String userData) {
        userData += " ";
        userDataNums = new String[userData.length()];
        String temp = "";
        int index = 0;
        for (int i = 0; i < userData.length(); i++){
            if (userData.charAt(i) == ' '){
                userDataNums[index++] = temp;
                temp = "";
                continue;
            }
            temp += userData.charAt(i);
        }
        stack = new Stack(userDataNums.length);
    }

    public void calcRes(){
        for (String i : userDataNums){
            if (i == null) break;
            switch (i){
                case "+" -> stack.push(stack.pop() + stack.pop());
                case "-" -> stack.push(stack.pop() - stack.pop());
                case "*" -> stack.push(stack.pop() * stack.pop());
                case "/" -> stack.push(stack.pop() / stack.pop());
                default -> stack.push(Integer.parseInt(i));
            }
        }
        stack.printStack();
    }

}
