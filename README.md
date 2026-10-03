# 🧾 Sistema de Impostos

Projeto desenvolvido em **Java** como atividade prática de **Programação Orientada a Objetos (POO)**.

O sistema permite cadastrar uma empresa e registrar diferentes tipos de impostos, realizando automaticamente os cálculos de **PIS** e **IPI**. Os impostos são armazenados em uma `ArrayList` utilizando uma interface comum, permitindo aplicar **polimorfismo** no processamento dos dados.

## 🚀 Funcionalidades

* 🏢 Cadastro do nome da empresa
* 📋 Cadastro de impostos PIS e IPI
* 🧮 Cálculo automático dos impostos
* 📦 Armazenamento dos impostos utilizando `ArrayList`
* 🔄 Utilização de polimorfismo através da interface `Imposto`
* ⛔ Encerramento do cadastro através da opção `PARE`
* 📊 Exibição dos impostos cadastrados e seus respectivos valores

## 🧮 Cálculo dos Impostos

### PIS

O cálculo do PIS utiliza a diferença entre o valor do débito e o valor do crédito:

```text
(debito - credito) × 1,65%
```

### IPI

O cálculo do IPI considera o valor do produto, frete, seguro e demais despesas:

```text
(valor + frete + seguro + despesas) × (alíquota / 100)
```

## 🧠 Conceitos de POO utilizados

O projeto foi desenvolvido para praticar conceitos importantes de **Programação Orientada a Objetos**:

* **Interface** — criação da interface `Imposto`
* **Polimorfismo** — tratamento de PIS e IPI através do tipo `Imposto`
* **Encapsulamento** — atributos privados com getters e setters
* **Construtores** — inicialização dos objetos
* **Herança de contrato** — classes `Pis` e `Ipi` implementando `Imposto`
* **ArrayList** — armazenamento dos impostos cadastrados
* **Laço de repetição** — utilização de `do while`
* **Estruturas condicionais** — processamento das opções escolhidas pelo usuário
* **Scanner** — entrada de dados pelo terminal

## 📂 Estrutura do Projeto

```text
sistemaimpostos/
├── Imposto.java
├── Pis.java
├── Ipi.java
├── Pagamentos.java
└── SistemaImpostos.java
```

### `Imposto.java`

Interface responsável por definir os comportamentos que os impostos devem possuir:

```java
double calcularImposto();
String getDescricao();
```

### `Pis.java`

Responsável pelo cálculo do imposto PIS.

### `Ipi.java`

Responsável pelo cálculo do imposto IPI.

### `Pagamentos.java`

Responsável por armazenar os impostos cadastrados e exibir seus resultados.

### `SistemaImpostos.java`

Classe principal responsável pela interação com o usuário através do terminal.

## 💻 Tecnologias utilizadas

* ☕ Java
* 🧠 Programação Orientada a Objetos
* 📚 `ArrayList`
* ⌨️ `Scanner`
* 🖥️ Apache NetBeans

## ▶️ Execução

Execute a classe:

```text
SistemaImpostos.java
```

O programa solicitará o nome da empresa e apresentará um menu para cadastro dos impostos:

```text
----Calculadora de Impostos----
Digite o nome da empresa : Barreto

Digite (1) para PIS
Digite (2) para IPI
Digite PARE para encerrar
```

Após o cadastro, o sistema apresenta os impostos registrados e seus respectivos cálculos.

## 📌 Objetivo

Este projeto faz parte da minha jornada de estudos em **Desenvolvimento de Sistemas**, com foco no aprendizado e na prática dos conceitos fundamentais de **Java e Programação Orientada a Objetos**.

O objetivo principal foi compreender na prática como interfaces, polimorfismo, encapsulamento e coleções podem ser utilizados na construção de uma aplicação Java.

---

👨‍💻 **Desenvolvido por Barreto**

# 🧾 Sistema de Impostos

Projeto desenvolvido em **Java** como atividade prática de **Programação Orientada a Objetos (POO)**.

O sistema permite cadastrar uma empresa e registrar diferentes tipos de impostos, realizando automaticamente os cálculos de **PIS** e **IPI**. Os impostos são armazenados em uma `ArrayList` utilizando uma interface comum, permitindo aplicar **polimorfismo** no processamento dos dados.

## 🚀 Funcionalidades

* 🏢 Cadastro do nome da empresa
* 📋 Cadastro de impostos PIS e IPI
* 🧮 Cálculo automático dos impostos
* 📦 Armazenamento dos impostos utilizando `ArrayList`
* 🔄 Utilização de polimorfismo através da interface `Imposto`
* ⛔ Encerramento do cadastro através da opção `PARE`
* 📊 Exibição dos impostos cadastrados e seus respectivos valores

## 🧮 Cálculo dos Impostos

### PIS

O cálculo do PIS utiliza a diferença entre o valor do débito e o valor do crédito:

```text
(debito - credito) × 1,65%
```

### IPI

O cálculo do IPI considera o valor do produto, frete, seguro e demais despesas:

```text
(valor + frete + seguro + despesas) × (alíquota / 100)
```

## 🧠 Conceitos de POO utilizados

O projeto foi desenvolvido para praticar conceitos importantes de **Programação Orientada a Objetos**:

* **Interface** — criação da interface `Imposto`
* **Polimorfismo** — tratamento de PIS e IPI através do tipo `Imposto`
* **Encapsulamento** — atributos privados com getters e setters
* **Construtores** — inicialização dos objetos
* **Herança de contrato** — classes `Pis` e `Ipi` implementando `Imposto`
* **ArrayList** — armazenamento dos impostos cadastrados
* **Laço de repetição** — utilização de `do while`
* **Estruturas condicionais** — processamento das opções escolhidas pelo usuário
* **Scanner** — entrada de dados pelo terminal

## 📂 Estrutura do Projeto

```text
sistemaimpostos/
├── Imposto.java
├── Pis.java
├── Ipi.java
├── Pagamentos.java
└── SistemaImpostos.java
```

### `Imposto.java`

Interface responsável por definir os comportamentos que os impostos devem possuir:

```java
double calcularImposto();
String getDescricao();
```

### `Pis.java`

Responsável pelo cálculo do imposto PIS.

### `Ipi.java`

Responsável pelo cálculo do imposto IPI.

### `Pagamentos.java`

Responsável por armazenar os impostos cadastrados e exibir seus resultados.

### `SistemaImpostos.java`

Classe principal responsável pela interação com o usuário através do terminal.

## 💻 Tecnologias utilizadas

* ☕ Java
* 🧠 Programação Orientada a Objetos
* 📚 `ArrayList`
* ⌨️ `Scanner`
* 🖥️ Apache NetBeans

## ▶️ Execução

Execute a classe:

```text
SistemaImpostos.java
```

O programa solicitará o nome da empresa e apresentará um menu para cadastro dos impostos:

```text
----Calculadora de Impostos----
Digite o nome da empresa : Barreto

Digite (1) para PIS
Digite (2) para IPI
Digite PARE para encerrar
```

Após o cadastro, o sistema apresenta os impostos registrados e seus respectivos cálculos.

## 📌 Objetivo

Este projeto faz parte da minha jornada de estudos em **Desenvolvimento de Sistemas**, com foco no aprendizado e na prática dos conceitos fundamentais de **Java e Programação Orientada a Objetos**.

O objetivo principal foi compreender na prática como interfaces, polimorfismo, encapsulamento e coleções podem ser utilizados na construção de uma aplicação Java.

---

👨‍💻 **Desenvolvido por Barreto**

## 📄 Licença

Este projeto está licenciado sob a [MIT License](LICENSE).
