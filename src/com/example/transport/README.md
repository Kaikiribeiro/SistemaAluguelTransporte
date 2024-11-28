
# Sistema de Aluguel de Meios de Transporte Individuais

## Descrição
Este projeto foi desenvolvido para gerenciar o aluguel de meios de transporte individuais utilizando o padrão de projeto **Abstract Factory**. Ele organiza a criação de transportes em categorias específicas:

- **Movidos a bateria**: Patinetes elétricos, bicicletas elétricas.
- **Movidos pelo esforço humano**: Bicicletas convencionais, patins, skates.

O sistema assegura que cada transporte seja criado de forma compatível com sua categoria, utilizando fábricas especializadas.

---

## Estrutura do Projeto
O projeto segue a estrutura abaixo:

```
src/
└── com.example.transport
├── Transport.java
├── ElectricScooter.java
├── ElectricBike.java
├── Bicycle.java
├── RollerSkates.java
├── Skateboard.java
├── TransportFactory.java
├── ElectricTransportFactory.java
├── HumanPoweredTransportFactory.java
└── Main.java
```

---

## Requisitos Técnicos
- **Interface**: `Transport` define o método `void ride()` que exibe uma mensagem sobre o uso do transporte.
- **Classes Concretas**: Implementam os transportes individuais.
- **Fábricas**:
  - `ElectricTransportFactory`: Cria transportes movidos a bateria.
  - `HumanPoweredTransportFactory`: Cria transportes movidos pelo esforço humano.
- **Main**: Contém a lógica de execução para demonstrar o uso das fábricas.

---

## Exemplo de Uso
Aqui está um exemplo de como o sistema funciona na prática:

```java
public class Main {
    public static void main(String[] args) {
        // Fábrica para transportes movidos a bateria
        TransportFactory electricFactory = new ElectricTransportFactory();
        Transport electricBike = electricFactory.createBike();
        electricBike.ride();

        // Fábrica para transportes movidos pelo esforço humano
        TransportFactory humanFactory = new HumanPoweredTransportFactory();
        Transport skateboard = humanFactory.createSkate();
        skateboard.ride();
    }
}
```

### Saída esperada no console:
```plaintext
Usando uma Bicicleta Elétrica.
Usando um Skate.
```

---

## Como Executar
1. Clone o repositório:
   ```bash
   git clone <URL_DO_SEU_REPOSITORIO>
   ```
2. Navegue até o diretório do projeto e compile o código:
   ```bash
   javac -d bin src/com/example/transport/*.java
   ```
3. Execute a classe principal:
   ```bash
   java -cp bin com.example.transport.Main
   ```

---
