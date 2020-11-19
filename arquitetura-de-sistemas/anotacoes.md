# Anotações



# Pesquisa e opinião sobre método Desenvolvimento Baseado em Componentes

Desde o primeiro momento que encontrei o termo Desenvolvimento Baseado em Componentes achei estranho e me pareceu haver algo errado e decidi pesquisar mais sobre o assunto. 

Acredito que minha estranheza decorre de não ter experiẽncia profissional com sistemas java. Aprendi a programar em Basic, depois fui para o DBase, em seguida pro Clipper, e então VisualBasic. Foi quando chegou a internet e comecei a trabalhar com ASP e PHP no backend e JavaScript no frontend. Depois veio a plataforma .NET e então o C#. O fato é que há vários anos há uma tendência para evitar o uso de plugins nas aplicações web por muitas razões e algumas delas relacionadas a segurança. E consequentemente, não há futuro para componentes plugins na web.

Pessoalmente, nunca instalei um sistema feito em java que não fosse obrigatório. Houve uma época que era necessário para utilizar serviços de bancos online e esta era a única razão. Ainda em minha experiência pessoal, instalar um serviço (JVM) que consumia muitos recursos de memória e processamento, e abria brechas de segurança, para usar um sistema (do banco) uma ou duas vezes por mês, nunca foi interessante.

Mas voltando a questão dos componentes, também não faz sentido desenvolver um sistema (não um plugin) pensando somente em componentes individuais, que é a proposta do dito "Desenvolvimento Baseado em Objetos". É necessário pensar no papel que o componente desempenha no sistema, e este papel está relacionado a camada em que o componente é utilizado. A camada determina o propósito de um componente quando estamos falando de arquitetura de sistemas.

Em minha opinião, faz sentido seguir os processos de desenvolvimento de software. Iniciar com a análise de requisitos e definir uma arquitetura para este cenário. Os modelos conceituais, testes, implementação, etc. Tudo pensado para o cenário atual com foco na compatibilidade com princípios de qualidade da estrutura e comportamento do sistema, que são os valores principais que um software deve oferecer para seus stakeholders.

O referido assunto, surgiu no curso de sistemas de informação que participo, onde me deparei com um material didático que ao meu ver, confunde mais do que explica. Fato facilmente comprovado com uma simples visita ao fórum de discussões. A matéria Programação Web ensina como criar plugins Java para rodar no navegador numa época onde isso não existe mais. A matéria Arquitetura de Sistemas, perde a oportunidade de fazer um vínculo entre os componentes e seu papel na arquitetura como se somente plugins fossem considerados na elaboração do material didático. Perde a oportunidade de criar um vínculo entre os componentes e seu propósito no contexto do sistema, além de desconsiderar os princípios que regem sua construção e inter-comunicação.

Na página 75 do livro, finalmente a descrição do "Desenvolvimento de Software Baseado em Componentes" informa que é isso é para criar software somente integrando componentes utilizando conjunto de 4 tarefas: Qualificação de Componentes, Adaptação de Componentes, Combinação dos Componentes em Sistemas, e Evolução do Sistema.

Sem querer ser cético, mas depois de 20 anos de desenvolvimento profissional de software e ter trabalhado em sistemas para diferentes plataformas para dezenas senão centenas de empresas, nunca vi um único sistema criado desta forma. Até peço ao leitor para compartilhar aqui nos comentários se já teve a oportunidade de trabalhar em algum projeto em que apenas juntou componentes para criar um sistema novo.

Outro ponto frustrante no curso, é a atenção quase que exclusiva dada a tecnologia CORBA para construção de sistemas distribuídos. A primeira versão desta tecnologia era uma farsa, e a segunda versão (OMG) demorou demais para ser criada e foi marcada por complexidades desnecessárias, implementação mal feita, com documentação de péssima qualidade, e funcionalidades implementadas sem nunca terem sido sequer testadas. Fatores que fizeram esta tecnologia cair em desuso rapidamente. Não há um caso de uso desta tecnologia citado no livro, nenhum exemplo de implementação, e minha opinião sobre o curso fica ainda pior. Minha avaliação pessoal sobre o curso até o momento é muito ruim.



# Referências

The Rise and Fall of CORBA
https://queue.acm.org/detail.cfm?id=1142044

O url contém artigo abrangente de 2006 detalhando os inúmeros fatores para o curto período de sucesso da tecnologia CORBA. Também esclarece as diferenças entre as tecnologias para computação distribuída.