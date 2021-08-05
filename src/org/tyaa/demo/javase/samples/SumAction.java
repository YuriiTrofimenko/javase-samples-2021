package org.tyaa.demo.javase.samples;

public class SumAction implements IAction {
    @Override
    public int perform(int x, int y) {
        return Main.sum(x, y);
    }
}
