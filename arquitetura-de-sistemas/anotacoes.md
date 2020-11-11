# Anotações


## Sobre o Plano de Ensino

http://estacio.webaula.com.br/cursos/gon629/galeria/apresentacao/docs/plano_de_ensino.pdf

No trecho a seguir, a tradução correta para o padrão MVC é Modelo-Visão-Controlador. Também é relevante comentar que os termos em inglês deveriam ser utilizados ou pelo menos colocados junto ao texto porque no mundo real eles serão utilizados no dia a dia.

    Além de apresentar aos Alunos Conceitos e modelos de arquitetura de sistemas, reuso de software, tubos e filtros, camadas, modelo-visão-controle, visões de arquitetura, componentes, Linguagens de descrição de arquiteturas, arquitetura orientada a serviço e arquiteturas baseadas em componentes.

No trecho abaixo, mais uma vez os termos em português confundem, mas no final do parágrafo, Construção deveria estar antes de Provisionamento. E também o termo Construção refere-se ao processo de compilação do código e não a construção do sistema em si, que pode gerar confusão para quem está iniciando seus estudos.

    Componentes de Sistemas, O Processo de esenvolvimento, Aplicando UML, Definição de Requisitos, Identificação de Componentes, Interação e Componentes, Especificação de Componentes e Provisionamento e Construção.

Arquiteturas de sistemas assim como os próprios sistemas são construídos com base em princípios que explicam o porquê e também como estes são criados.

Há diversos recuos indevidos na lista de tópicos das unidades e o uso de letras maiúsculas em todo o documento apenas contribui para aumentar o número de páginas e atrapalha a leitura.

No item "Unidade 9", há uso de siglas sem o respectivo significado. 

    4 – ARQUIVOS CIDL
    5 – ARQUIVOS CIF

O professor contratado não relatou ou não possui qualquer experiência profissional que comprove capacidade e conhecimento em arquitetura de software. 

As Unidades relacionadas no plano de ensino listam tópicos relacionados a diversas áreas do desenvolvimento de software que só podem estar presentes nesta matéria se o vínculo entre a arquitetura e o referido tópico estiver muito bem detalhado. Por exemplo, o desenvolvimento (Unidade 2) na visão da arquitetura, ou a definição de requisitos (Unidade 4) e qual sua relação com a arquitetura de software, etc.

# Aula 1 - Componentes de sistemas

## Objetivos 

Os objetivos apresentados para aula 1 são:

* Descrever a criação de arquiteturas de sistemas e reuso;
* Analisar camadas, artefatos e componentes;
* Avaliar linguagens de descrição de arquiteturas.

Na introdução, os três primeiros parágrafos não acrescentam muito mas o quarto paráfo, revela uma compreensão equivocada de que componentes é um tipo de abordagem de desenvolvimento. Não é. Componente é um arquivo binário executável que pode ser referênciado em tempo de execução, um arquivo com a extensão dll no windows por exemplo. O restante do texto continua equivocado sobre o que é um componente.

No tópico de título "Fundamentos de componentes" o primeiro parágrafo não acrescenta nada e o segundo parágrafo desta vez relaciona a criação de componentes ao conceito de programação orientada a objetos. Isso está errado. Componentes são construídos com códigos de todos os três paradigmas trabalhando em conjunto para gerar um arquivo binário executável (componente). Mas também podemos ter componentes criados utilizando o paradigma funcional ou estruturado.

No título "União de dados e funções" o texto não diz nada com nada. Está sendo utilizado o termo "objeto de software" referindo-se a uma instância de objeto, causando confusão e dificuldade para o entendimento.

    Um objeto de software consiste em dados que podem assumir valores e funções que tratam esses dados. Os dados e funções devem ter uma ligação natural entre eles, formando o conceito de classe.

O tópico seguinte "Encapsulamento" se relaciona a matéria de programação orientada a objetos e aqui não há qualquer vínculo ou relação com arquitetura de software ou componentes.

No tópico "Identidade", mais uma vez o termo componente está sendo utilizado para referir-se a uma instância de objeto e portanto totalmente equivocado.

O tópico "O que é um componente afinal?" novamente o termo componente está sendo utilizado de maneira equivocada ao referir-se como uma instância de objeto da matéria programação orientada a objetos.

Logo em seguida, há uma afirmação "Podemos, assim, ter mais de uma interface em um mesmo componente." E novamente os termos usados não estão corretos. O termo interface aqui está sendo utilizada no sentido de uma API (Application Programming Interface) onde podemos ter métodos (funções) com o mesmo nome recebendo diferentes parâmetros mas isso não tem nada a ver com componentes.

E o parágrafo seguinte (copiado abaixo) afirma equivocadamente que "pessoa" é um componente quando não é. Pessoa no exemplo é uma classe e não um componente.

    "Deve existir nos componentes uma relação natural como o que ele representa. Por exemplo, o componente Pessoa está associado à classe pessoa no mundo real."

O restante do texto continua todo utilizando o termo componente no sentido de classe. Este texto faria algum sentido na matéria programação orientada a objetos mas aqui, na matéria arquitetura de software esta primeira aula está completamente equivocada e neste momento estou assustado em pensar que a avaliação seja baseada nesta aula.

Quero comentar que eu não havia chegado ao final do texto da aula 1 primeiro porque eu estava insatisfeito com o que havia lido até o ponto em que parei e também porque estava com pouco tempo. 

No tópico "Características de componentes", No último item da suposta lista de características, aparece um exemplo de um componente para atualizar endereço utilizando cep. Mais uma vez errado. Ninguém cria um componente de arquitetura de software para um controle de alteração de cep. No máximo, podemos imaginar que uma empresa que desenvolve componentes de interface (interface aqui referindo-se a uma view ou tela), pode criar um controle de atualização de endereço por cep como parte de sua biblioteca de controles que são empacotados em um único componente e distribuídos de diferentes formas. Mas certamente é imprescindível, numa aula de arquitetura de software, fazer o vinculo ou seja, explicar onde o referido componente se encaixa na arquitetura.

No tópico "Exemplo de uso de componentes" o exemplo fala sobre utilizar o componente do MS Excel ou OpenOffice para criar um relatório em um sistema imaginário e que precisamos mapear as interfaces de uso dessas planilhas. O que significa isso eu não faço nem ideia. Mas na prática, já utilizei diferentes componentes para gerar planilhas do Excel. Quando eu tinha certeza que os usuários do sistema possuiam o referido software instalado na máquina, utilizei o componente disponibilizado pela própria fabricante. Neste caso apenas adicionei uma referência ao componente "Microsoft Excel 15.0 Oject Library" e utilizei a API (o conjunto de métodos que o componente oferece) para produzir a planilha. Mas houveram situações em que os requisitos diziam que nem todos os usuários teriam o Excel instalado na máquina, e para este cenário foi necessário utilizar um componente criado por outro fabricante para gerar planilhas mas o processo utilizado foi parecido, adicionar uma referência para o componente externo e então fazer uso de sua API para obter as funcionalidades que necessito, no exemplo, criar uma planilha do Excel.

Na sequência, a webaula mostra um gráfico mas não há qualquer explicação sobre o que significa, qual o papel de cada componente ilustrado, o que significa a "bolinha", a caixinha, a linha sólida e a linha tracejada, etc. Não há qualquer explicação de nada. 

O tópico "O que não é um componente?" é onde finalmente aparece algo sobre componentes que faz sentido. O segundo parágrafo fala da necessidade de haver uma interface, e desta vez finalmente utilizada da forma como realmente ocorre em um componente ao demandar uma interface (aqui no sentido de API).

O tópico seguinte da webaula fala sobre definição de arquitetura de sistemas e componentes. E realmente uma arquitetura sempre vai conter um conjunto de componentes mas fica faltando uma parte imprescindível da história que são as camadas. A arquitetura é composta primeiramente por camadas, e os componentes são parte destas camadas. E o que determina a forma como estes componentes se comunicam é exatamente a camada em que está ele está contido e o papel que ele representa ou funcionalidade que oferece através de sua API. E no resumo que a webaula mostra para Arquitetura de Componentes, também falta relacionar os componentes com a camada a qual pertence. 




# Teste 1

Na primeira pergunta já fica claro que continua sendo utilizado o termo componente como sendo uma classe de maneira totalmente equivocada. E também a terceira afirmação da pergunta número um (abaixo) afima que o componente pode ser dependente e auto-suficiente mas esta afirmação não faz sentido.

    III - Componentes podem ser objetos, conjunto de objetos, sistemas ou qualquer implementação que seja dependente e auto-suficiente.

Mas a pergunta também já está errada. O enunciado da pergunta 1 já começa errado porque não existe processo de desenvolvimento baseado em componentes. Os únicos paradigmas de desenvolvimento existentes são: Funcional, Estruturado e Orientado a Objetos.

    De acordo como processo de desenvolvimento baseado em componentes, analise as assertivas e assinale a alternativa que aponta a(s) correta(s).

Todas as perguntas e alternativas do teste estão mal feitas e equivocadas. Palavras sem sentido são utilizadas, meias verdades são ditas de forma quase incompreensível.


# Aula 2 - O processo de desenvolvimento

A descrição logo baixo do título, copiada abaixo, contém a sigla RUP sem informar o que significa, mas também workflow não significa metodologia. Workflow significa fluxo de trabalho, ou seja, os passos para realização de algo. Neste caso, o desenvolvimento de software.

    Workflow representa a metodologia de desenvolvimento de sistemas baseada na metodologia RUP.

Em seguida o título "O gerenciamento de processos" está sendo utilizado para fazer referência as etapas de desenvolvimento no modelo em cascata.

# Teste 2

A pergunta número um não faz nenhuma referência ou indicação de ocorrẽncia de iteratividade no desenvolvimento, e portanto, a opção correta deveria ser a opção 3 (incremental) mas a opção que aparece como correta é a 5 (iterativo e incremental).

    A metodologia de gestão deve contemplar quantas fases forem necessárias para conseguir que todas as áreas de conhecimento sejam abordadas de forma a garantir que escopo, tempo, custos e qualidade atinjam os níveis definidos pelas corporações como sendo os ideais. Qual o modelo de desenvolvimento, estas fases da metodologia devem seguir?


# Aula 3 - Aplicando UML


* UML e suas generalizações
* Conformidaded em requisitos UML
* Técnicas de modelagem UML





# Fórum

O que casos de uso tem a ver com RUP? Também sobre o texto abaixo do título, estou confuso sobre o que quer dizer "define como o sistema será utilizado". Utilizado pelo usuário do sistema ou pelo desenvolvedor? e também não entendo como a arquitetura diz para a empresa como vai resolver o problema. A arquitetura não é a definição de camadas e a forma como os componentes destas camadas se comunicam? 

Na posição do vídeo indicado pelo professor (22:00-23:00) há um slide informando que os elementos da RUP que não consigo relacionar com o texto que pesquisei na wikipedia. No texto da wikipedia, os elementos principais da RUP são: Roles (who), Work products (what), e Tasks (how). O RUP define os perfis dos profissionais envolvidos, incluindo as competências necessárias, o produto ou resultado do trabalho incluindo os artefatos produzidos, e as tarefas que são atribuídas a um dos perfis para produzir um resultado útil. E as recomendações principais são:

1- Desenvolva de maneira iterativa inicialmente atacando o principal que eles chamam de risco.
2- Gerencie os requisitos
3- Utilize alguma arquitetura de componentes
4- Modele visualmente o software
5- Verifique continuamente a qualidade
6- Controle as alterações

Referências:

https://en.wikipedia.org/wiki/Rational_Unified_Process




