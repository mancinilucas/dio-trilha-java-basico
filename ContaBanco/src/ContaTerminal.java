public class ContaTerminal {
    Integer numero;
    String agencia;
    String nomeDoCliente;
    Float saldo;

    public ContaTerminal() {
    }

    public ContaTerminal(Integer numero, String agencia, String nomeDoCliente, Float saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeDoCliente = nomeDoCliente;
        this.saldo = saldo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeDoCliente() {
        return nomeDoCliente;
    }

    public void setNomeDoCliente(String nomeDoCliente) {
        this.nomeDoCliente = nomeDoCliente;
    }

    public Float getSaldo() {
        return saldo;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Olá " + nomeDoCliente +
                ", obrigado por criar uma conta em nosso banco" +
                ", sua agencia é " + agencia +
                ", conta " + numero +
                " e seu saldo " + saldo +
                " já está disponível para saque.";
    }
}
