package io.github.thiago.arquiteturaspring.montadora.configuration;

import io.github.thiago.arquiteturaspring.montadora.Motor;
import io.github.thiago.arquiteturaspring.montadora.TipoMotor;
import io.github.thiago.arquiteturaspring.montadora.api.Aspirado;
import io.github.thiago.arquiteturaspring.montadora.api.Eletrico;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MontadoraConfiguration {

    @Bean(name = "motorAspirado")
    @Aspirado
    public Motor motorAspirado() {
        var motor = new Motor();
        motor.setCavalos(120);
        motor.setCilindradas(4);
        motor.setModelo("XPTO-0");
        motor.setLitragem(2.0);
        motor.setTipo(TipoMotor.ASPIRADO);
        return motor;
    }

    @Bean(name = "motorEletrico")
    @Eletrico
    public Motor motorEletrico() {
        var motor = new Motor();
        motor.setCavalos(110);
        motor.setCilindradas(3);
        motor.setModelo("TH-40");
        motor.setLitragem(1.4);
        motor.setTipo(TipoMotor.ELETRICO);
        return motor;
    }

    @Bean(name = "motorTurbo")
    @Primary
    public Motor motorTurbo() {
        var motor = new Motor();
        motor.setCavalos(180);
        motor.setCilindradas(4);
        motor.setModelo("XPTO-01");
        motor.setLitragem(1.5);
        motor.setTipo(TipoMotor.TURBO);
        return motor;
    }

}
