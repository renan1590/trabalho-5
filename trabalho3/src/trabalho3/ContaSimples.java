package trabalho3;

public class ContaSimples extends Conta {
	private double saldoPolpanca;

	public ContaSimples() {
		
	}
	
	public ContaSimples(String banco,int agencia,int numeroconta,double saldo,double saldoPolpanca) {
		super(banco,agencia,numeroconta,saldo);
		setSaldo(saldoPolpanca);
	}
	
	public double getSaldoPolpanca() {
		return saldoPolpanca;
	}

	public void setSaldoPolpanca(double saldoPolpanca) {
		if(saldoPolpanca > 0)
		 this.saldoPolpanca = saldoPolpanca;
	}

	public boolean depositoPolpanca(double valor) {
		if(valor > saldoPolpanca) {
			return true;
		} else {
			return false;
		}
	}	
		public boolean saquePolpanca(double valor) {
			if(valor < saldoPolpanca) {
				return true;
			} else {
				return false;
			}
		}

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("ContaSimples [saldoPolpanca=");
			builder.append(saldoPolpanca);
			builder.append(", toString()=");
			builder.append(super.toString());
			builder.append("]");
			return builder.toString();
		}
		
		
	}
	
	


