public class Conversor {

    public static double converterParaDolar(double valorReal) {
        double taxaDolar = 5.10; // 1 USD = 5.10 BRL
        return valorReal / taxaDolar;
    }

    public static double converterParaEuro(double valorReal) {
        double taxaEuro = 5.45; // 1 EUR = 5.45 BRL
        return valorReal / taxaEuro;
    }

    public static double converterParaLibra(double valorReal) {
        double taxaLibra = 6.30; // 1 GBP = 6.30 BRL
        return valorReal / taxaLibra;
    }
}

