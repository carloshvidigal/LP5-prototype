package prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Car car = new Car(new Brand("FIAT", "Itália", "Turim"), "Toro", "2023", "Preta");

        Car carClone = car.clone();
        carClone.setName("Pulse");
        carClone.setColor("Azul");
        carClone.setManufactureYear("2022");

        assertEquals("Carro {Marca: (Nome: FIAT, País: Itália, Cidade: Turim), Nome: Toro, Ano de Fabricação: 2023, Cor: Preta}", car.toString());
        assertEquals("Carro {Marca: (Nome: FIAT, País: Itália, Cidade: Turim), Nome: Pulse, Ano de Fabricação: 2022, Cor: Azul}", carClone.toString());


    }
}
