package com.tyler.builder;
/*构建者设计模式*/
public class Computer {
    public String mouse;
    public String keyboard;
    public String cpu;
    public String monitor;

    @Override
    public String toString() {
        return "Computer{" +
                "mouse='" + mouse + '\'' +
                ", keyboard='" + keyboard + '\'' +
                ", cpu='" + cpu + '\'' +
                ", monitor='" + monitor + '\'' +
                '}';
    }

    public String getMouse() {
        return mouse;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public static class Builder{
        private final Computer computer = new Computer();
        public Builder builderMouse(String type){
            computer.setMouse("安装了一个"+type+"类型的鼠标");
            return this;
        }

        public Builder builderKeyboard(String type){
            computer.setKeyboard("安装了一个"+type+"类型的键盘");
            return this;
        }

        public Builder builderCpu(String type){
            computer.setCpu("安装了一个"+type+"类型的Cpu");
            return this;
        }

        public Builder builderMonitor(String type){
            computer.setMonitor("安装了一个"+type+"类型的显示器");
            return this;
        }

        public Computer build(){
            return computer;
        }
    }
}
