package bytebankHeredado;

public class TestCuenta {
	public static void main(String[] args) {
		CuentaCorriente cc = new CuentaCorriente(11, 011);
		CuentaAhorro ca = new CuentaAhorro(2, 5);
		cc.deposita(2000);
		cc.transfiere(1000, ca);
		System.out.println(cc.getSaldo());
		System.out.println(ca.getSaldo());
	}
}
