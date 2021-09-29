package DesignPatterns.Decorator_pattern;

public abstract class Display {
    public abstract int getColumns(); // 获取横向字符数

    public abstract int getRows(); // 获取行数

    public abstract String getRowText(int row); //获取第row行字符串

    public final void show() {                  //输出每一行 (常量方法，子类不能重写)
        for(int i = 0; i < getRows(); i++) {
            System.out.println(getRowText(i));
        }
    }
}
