public class RegistroDeHoras {
    private String cpf;
    private String data;
    private int horasTrabalhadas;

    public RegistroDeHoras(String cpf, String data, int horasTrabalhadas) {
        this.cpf = cpf;
        this.data = data;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
}