package telran.calculator.model;

public enum Operation {
    AND{
        @Override
        public double apply(int x, int y){
           return x&y;
        }
    }, OR {
        @Override
        public double apply(int x, int y) {
            return x|y;
        }
    }, XOR {
        @Override
        public double apply(int x, int y) {
            return x^y;
        }
    }, NOT {
        @Override
        public double apply(int x, int y) {
            return ~x;
        }
    }, SHIFT_LEFT {
        @Override
        public double apply(int x, int y) {
            return x<<y;
        }
    }, SHIFT_RIGHT {
        @Override
        public double apply(int x, int y) {
            return x>>y;
        }
    },UNSIGNED_SHIFT_RIGHT {
        @Override
        public double apply(int x, int y) {
            return x>>>y;
        }
    };




    public abstract double apply(int x, int y);
}
