package Aula05_ProxyPattern;

import java.util.Date;

public class ServicoVacinarProxy implements Vacinar {
    @Override
    public void vacinarPessoa(String rg, Date dataVacina, String tipoVacina) {
        if (dataVacina.before(new Date())) {
            ServicoVacinar servicoVacinar = new ServicoVacinar();
            servicoVacinar.vacinarPessoa(rg, dataVacina, tipoVacina);
            System.out.println("Cidadao vacinado com Sucesso!");
        } else {
            System.out.println("Data atual é anterior a data marcada");
        }
    }
}
