public class IntsCalculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() {
        this.target = new Calculator();
    }

    @Override
    public int sum(int arg0, int arg1) {
        //считаем через target
        int result;
        Calculator.Formula operations = this.target.newFormula();
        result = (int) operations.addOperand(arg0).addOperand(arg1).calculate(Calculator.Operation.SUM).result();
        return result;
    }

    @Override
    public int mult(int arg0, int arg1) {
        //считаем через target
        int result;
        Calculator.Formula operations = this.target.newFormula();
        result = (int) operations.addOperand(arg0).addOperand(arg1).calculate(Calculator.Operation.MULT).result();
        return result;
    }

    @Override
    public int pow(int a, int b) {
        //считаем через target
        int result;
        Calculator.Formula operations = this.target.newFormula();
        result = (int) operations.addOperand(a).addOperand(b).calculate(Calculator.Operation.POW).result();
        return result;
    }
}
