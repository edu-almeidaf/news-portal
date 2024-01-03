package com.eduardo.trybeportal

object NewsDatabase {
    private val newsList = listOf(
        News(
            1,
            "economia",
            "Crescimento econômico surpreende e supera expectativas",
            "O Produto Interno Bruto (PIB) do país registrou um aumento de 3% no último trimestre, surpreendendo os analistas e indicando uma recuperação sólida da economia."
        ),
        News(
            2,
            "economia",
            "Setor de tecnologia impulsiona o mercado financeiro",
            "Empresas de tecnologia lideraram os ganhos no mercado de ações, impulsionando o índice Dow Jones para novos recordes."
        ),
        News(
            3,
            "economia",
            "Inflação permanece estável, trazendo alívio aos consumidores",
            "Os índices de inflação se mantiveram estáveis, aliviando as preocupações dos consumidores e indicando uma gestão eficaz da política monetária."
        ),
        News(
            4,
            "economia",
            "Empresas locais expandem operações internacionalmente",
            "Diversas empresas locais anunciaram planos de expansão internacional, consolidando a presença do país nos mercados globais."
        ),
        News(
            5,
            "economia",
            "Moeda nacional atinge a maior cotação em meses",
            "A moeda nacional ganhou força em relação a outras moedas importantes, atingindo a maior cotação em meses e favorecendo as negociações comerciais."
        ),
        News(
            6,
            "economia",
            "Investimentos em infraestrutura impulsionam o crescimento regional",
            "Programas de investimento em infraestrutura foram implementados em diversas regiões, impulsionando o crescimento econômico e gerando empregos locais."
        ),
        News(
            7,
            "esportes",
            "Equipe nacional conquista medalhas nos Jogos Mundiais",
            "Os atletas do país brilharam nos Jogos Mundiais, conquistando medalhas de ouro, prata e bronze em diversas modalidades esportivas."
        ),
        News(
            6,
            "esportes",
            "Novos talentos do esporte ganham destaque nas competições juvenis",
            "Jovens atletas mostraram seu potencial em competições juvenis, chamando a atenção de olheiros e prometendo um futuro brilhante para o esporte nacional."
        ),
        News(
            9,
            "esportes",
            "Recordes quebrados nas competições de atletismo",
            "Atletas nacionais quebraram recordes em diversas provas de atletismo, demonstrando a excelência do país no cenário esportivo internacional."
        ),
        News(
            10,
            "esportes",
            "Equipe de futebol se classifica para a fase final do torneio internacional",
            "A equipe de futebol nacional garantiu sua vaga na fase final de um importante torneio internacional, gerando empolgação entre os torcedores."
        ),
        News(
            11,
            "esportes",
            "Atletas paralímpicos conquistam medalhas e inspiram o país",
            "Os atletas paralímpicos do país brilharam nos Jogos Paralímpicos, conquistando medalhas e inspirando a superação através do esporte."
        ),
        News(
            12,
            "esportes",
            "Investimentos em infraestrutura esportiva impulsionam o desempenho atlético",
            "O governo anunciou investimentos significativos em infraestrutura esportiva, visando melhorar as condições de treinamento e impulsionar o desempenho atlético nacional."
        ),
        News(
            13,
            "politica",
            "Novas políticas de educação são anunciadas pelo governo",
            "O governo apresentou um conjunto de medidas para melhorar a qualidade da educação no país, incluindo investimentos em infraestrutura escolar e capacitação de professores."
        ),
        News(
            14,
            "politica",
            "Reformas no sistema de saúde visam ampliar o acesso aos serviços",
            "Reformas significativas foram propostas no sistema de saúde, com o objetivo de ampliar o acesso aos serviços e melhorar a qualidade do atendimento."
        ),
        News(
            15,
            "politica",
            "Debates parlamentares sobre políticas ambientais ganham destaque",
            "Questões ambientais se tornaram foco dos debates parlamentares, com propostas de políticas visando a preservação do meio ambiente e o desenvolvimento sustentável."
        ),
        News(
            16,
            "politica",
            "Acordos internacionais fortalecem a posição diplomática do país",
            "O país firmou acordos internacionais que fortaleceram sua posição diplomática, abrindo portas para parcerias comerciais e cooperação em diversas áreas."
        ),
        News(
            17,
            "politica",
            "Projeto de lei de incentivo à inovação é discutido no Congresso",
            "Um projeto de lei que visa incentivar a inovação e pesquisa científica está em discussão no Congresso, recebendo apoio de diversos setores da sociedade."
        ),
        News(
            18,
            "politica",
            "Medidas de segurança pública são implementadas para redução da criminalidade",
            "O governo anunciou medidas de segurança pública com o objetivo de reduzir os índices de criminalidade, garantindo a tranquilidade da população."
        )
    )

    fun findAll() = newsList

    fun findById(id: Int) = newsList.find { it.id == id }

    fun findByCategory(category: String) = newsList.find { it.category == category }
}