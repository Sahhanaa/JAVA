public final class Computer {
    private final String CPU;
    private final String RAM;
    private final String HDD;
    private final String graphics;

    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.HDD = builder.HDD;
        this.graphics = builder.graphics;
    }

    public String getCPU() {
        return CPU;
    }

    public String getRAM() {
        return RAM;
    }

    public String getHDD() {
        return HDD;
    }

    public String getGraphics() {
        return graphics;
    }

    @Override
    public String toString() {
        return "Computer [CPU=" + CPU + ", RAM=" + RAM + 
               ", HDD=" + HDD + ", Graphics=" + graphics + "]";
    }

    public static class Builder {
        private final String CPU;
        private final String RAM;
        private String HDD;
        private String graphics;

        public Builder(String CPU, String RAM) {
            this.CPU = CPU;
            this.RAM = RAM;
        }

        public Builder setHDD(String HDD) {
            this.HDD = HDD;
            return this;
        }

        public Builder setGraphics(String graphics) {
            this.graphics = graphics;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}