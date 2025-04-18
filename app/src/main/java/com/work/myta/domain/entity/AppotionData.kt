package com.work.myta.domain.entity

import com.work.myta.R
import kotlinx.serialization.Serializable

@Serializable
data class AppotionData(
    val title: String,
    val description: String,
    val time: Int,
    val cost: Int,
    val master: String,
    val masterResId: Int
) {

}

val AnnaData = listOf(
    AppotionData(
        "НОВОГОДНИЙ МЕРЦАЮЩИЙ МАНИКЮР",
        "Услуга включает в себя: комбинированный или " +
                "классический маникюр (на выбор), выравнивание" +
                "ногтевой пластины базой, снятие + кошачий глаз, " +
                "глиттер, втирка, светоотражающий гель лак (на выбор)",
        90,
        2400,
        "Анна",
        R.drawable.anna
    ),
    AppotionData(
        "НОВОГОДНИЙ МАНИКЮР С МЕРЦАЮЩИМ ГЕЛЕМ",
        "Услуга включает в себя: комбинированный маникюр, " +
                "снятие, ремонт трещин и укрепление ногтей " +
                "мерцающим гелем",
        90,
        3100,
        "Анна",
        R.drawable.anna
    ),
    AppotionData(
        "КОМБИНИРОВАННЫЙ | КЛАССИЧЕСКИЙ МАНИКЮР +" +
                "ВЫРАВНИВАНИЕ ПРИ ПОКРЫТИИ " +
                "LUI PHILIPP",
        "Услуга включает в себя: комбинированный или классический маникюр (на выбор), выравнивание ногтевой пластины базой и однотонное покрытие гель-лаком российского бренда Lui Philipp\n" +
                "\n" +
                "\uFEFF*Снятие гель-лака входит в стоимость\n" +
                "\uFEFF\uFEFF*Снятие геля, полигеля, фаст геля - 400 рублей",
        90,
        1900,
        "Анна",
        R.drawable.anna
    ),
    AppotionData(
        "КОМБИНИРОВАННЫЙ | КЛАССИЧЕСКИЙ МАНИКЮР + ВЫРАВНИВАНИЕ ПРИ ПОКРЫТИИ LUXIO",
        "Услуга включает в себя: комбинированный или классический маникюр (на выбор), выравнивание ногтевой пластины базой и однотонное покрытие гель-лаком Luxio\n" +
                "\n" +
                "\uFEFF*Снятие гель-лака входит в стоимость\n" +
                "\uFEFF*Снятие геля, полигеля, фаст геля - 400 рублей",
        90,
        2100,
        "Анна",
        R.drawable.anna
    )
)
val EkaterinaData = listOf(
    AppotionData(
        "КОМБИНИРОВАННЫЙ МАНИКЮР + УКРЕПЛЕНИЕ" +
                "НОГТЕЙ КАМУФЛИРУЮЩИМ ГЕЛЕМ",
        "Услуга включает в себя: комбинированный маникюр, ремонт трещин и укрепление ногтей камуфлирующим гелем, что обеспечивает тонкое и прочное покрытие без сколов и отслоек, идеальные блики и носку без повреждений\n" +
                "\n" +
                "*Снятие гель-лака входит в стоимость",
        120,
        2400,
        "Екатерина",
        R.drawable.ekaterina
    ),
    AppotionData(
        "КОМБИНИРОВАННЫЙ МАНИКЮР + УКРЕПЛЕНИЕ НОГТЕЙ ТВЕРДЫМ ГЕЛЕМ ПРИ ПОКРЫТИИ LUXIO",
        "Услуга включает в себя: комбинированный маникюр, ремонт трещин и укрепление ногтей гелем, что позволяет укрепить ногтевую пластину, скрыть недостатки, придать ногтям ухоженный вид с идеально ровными бликами и обеспечить носку без повреждений и однотонное покрытие гель-лаком бренда Luxio\n" +
                "\n" +
                "*Снятие гель-лака входит в стоимость",
        120,
        2400,
        "Екатерина",
        R.drawable.ekaterina

    ),
    AppotionData(
        "НОВОГОДНИЙ МЕРЦАЮЩИЙ МАНИКЮР",
        "Услуга включает в себя: комбинированный или классический маникюр (на выбор), выравнивание ногтевой пластины базой, снятие + кошачий глаз, глиттер, втирка, светоотражающий гель лак (на выбор)\n",
        90,
        2900,
        "Екатерина",
        R.drawable.ekaterina
    ),
    AppotionData(
        "НОВОГОДНИЙ МАНИКЮР С МЕРЦАЮЩИМ ГЕЛЕМ",
        "Услуга включает в себя: комбинированный маникюр, снятие, ремонт трещин и укрепление ногтей мерцающим гелем",
        90,
        1900,
        "Екатерина",
        R.drawable.ekaterina
    )
)

val MariaData = listOf(
    AppotionData(
        "КОМБИНИРОВАННЫЙ МАНИКЮР + УКРЕПЛЕНИЕ НОГТЕЙ ТВЕРДЫМ ГЕЛЕМ ПРИ ПОКРЫТИИ LUXIO",
        "Услуга включает в себя: комбинированный маникюр, ремонт трещин и укрепление ногтей гелем, что позволяет укрепить ногтевую пластину, скрыть недостатки, придать ногтям ухоженный вид с идеально ровными бликами и обеспечить носку без повреждений и однотонное покрытие гель-лаком бренда Luxio\n" +
                "\n" +
                "*Снятие гель-лака входит в стоимость",
        120,
        3200,
        "Мария",
        R.drawable.maria
    ),
    AppotionData(
        "АРХИТЕКТУРА НОГТЕЙ + КОМБИНИРОВАННЫЙ" +
                "МАНИКЮР ПРИ ПОКРЫТИИ LUXIO",
        "Услуга включает в себя: архитектуру ногтей, что обеспечивает создание идеальных бликов, ровную ногтевую пластину без бугорков, корректировку формы клюющих ногтей, стойкость и защиту ногтевой пластины от повреждений, комбинированный маникюр и однотонное покрытие гель-лаком бренда Luxio\n" +
                "\n" +
                "*Снятие гель-лака входит в стоимость",
        150,
        3200,
        "Мария",
        R.drawable.maria
    ),
    AppotionData(
        "НОВОГОДНИЙ МЕРЦАЮЩИЙ МАНИКЮР",
        "Услуга включает в себя: комбинированный или классический маникюр (на выбор), выравнивание ногтевой пластины базой, снятие + кошачий глаз, глиттер, втирка, светоотражающий гель лак (на выбор)",
        90,
        2400,
        "Мария",
        R.drawable.maria
    ),
    AppotionData(
        "НОВОГОДНИЙ МАНИКЮР С МЕРЦАЮЩИМ ГЕЛЕМ",
        "Услуга включает в себя: комбинированный маникюр, снятие, ремонт трещин и укрепление ногтей мерцающим гелем",
        90,
        3100,
        "Мария",
        R.drawable.maria
    )
)
val ManikuryaData = listOf(
    AppotionData(
        "НОВОГОДНИЙ МЕРЦАЮЩИЙ МАНИКЮР",
        "Услуга включает в себя: комбинированный или " +
                "классический маникюр (на выбор), выравнивание" +
                "ногтевой пластины базой, снятие + кошачий глаз, " +
                "глиттер, втирка, светоотражающий гель лак (на выбор)",
        120,
        2400,
        "Анна",
        R.drawable.anna
    ),
    AppotionData(
        "НОВОГОДНИЙ МАНИКЮР С МЕРЦАЮЩИМ ГЕЛЕМ",
        "Услуга включает в себя: комбинированный маникюр, " +
                "снятие, ремонт трещин и укрепление ногтей " +
                "мерцающим гелем",
        120,
        3100,
        "Анна",
        R.drawable.anna
    ),
    AppotionData(
        "КОМБИНИРОВАННЫЙ | КЛАССИЧЕСКИЙ МАНИКЮР +" +
                "ВЫРАВНИВАНИЕ ПРИ ПОКРЫТИИ " +
                "LUI PHILIPP",
        "Услуга включает в себя: комбинированный или классический маникюр (на выбор), выравнивание ногтевой пластины базой и однотонное покрытие гель-лаком российского бренда Lui Philipp\n" +
                "\n" +
                "\uFEFF*Снятие гель-лака входит в стоимость\n" +
                "\uFEFF\uFEFF*Снятие геля, полигеля, фаст геля - 400 рублей",
        120,
        1900,
        "Анна",
        R.drawable.anna
    ),
    AppotionData(
        "КОМБИНИРОВАННЫЙ | КЛАССИЧЕСКИЙ МАНИКЮР + ВЫРАВНИВАНИЕ ПРИ ПОКРЫТИИ LUXIO",
        "Услуга включает в себя: комбинированный или классический маникюр (на выбор), выравнивание ногтевой пластины базой и однотонное покрытие гель-лаком Luxio\n" +
                "\n" +
                "\uFEFF*Снятие гель-лака входит в стоимость\n" +
                "\uFEFF*Снятие геля, полигеля, фаст геля - 400 рублей",
        150,
        2100,
        "Анна",
        R.drawable.anna
    )
)

val PedikuryaData = listOf(
    AppotionData(
        "НОВОГОДНИЙ МЕРЦАЮЩИЙ ПЕДИКЮР",
        "Услуга включает в себя комбинированный или классический педикюр (на выбор), снятие, кошачий глаз, глиттер, светоотражающий гель-лак (на выбор), " +
                "спа-уход - скрабирование и парафин (по желанию гостя)",
        75,
        2900,
        "Мария",
        R.drawable.maria
    ),
    AppotionData(
        "КОМБИНИРОВАННЫЙ | КЛАССИЧЕСКИЙ ПЕДИКЮР ПРИ ПОКРЫТИИ LUI PHILIPP",
        "Услуга включает в себя комбинированный или классический педикюр (на выбор), однотонное покрытие гель-лаком российского бренда Lui Philipp и спа-уход - скрабирование и парафин (по желанию гостя)\n" +
                "\n" +
                "*Снятие гель лака входит в стоимость услуг",
        105,
        2400,
        "Екатерина",
        R.drawable.ekaterina
    ),
    AppotionData(
        "КОМБИНИРОВАННЫЙ | КЛАССИЧЕСКИЙ ПЕДИКЮР" +
                "ПРИ ПОКРЫТИИ LUXIO",
        "Услуга включает в себя комбинированный или классический педикюр (на выбор), однотонное покрытие гель-лаком бренда Luxio и спа-уход - скрабирование и парафин (по желанию гостя)\n" +
                "\n" +
                "*Снятие гель лака входит в стоимость услуг",
        105,
        2600,
        "Мария",
        R.drawable.maria
    ),
    AppotionData(
        "SMART | КОМБИНИРОВАННЫЙ | КЛАССИЧЕСКИЙ" +
                "ПЕДИКЮР ПРИ ПОКРЫТИИ LUI PHILIPP",
        "Услуга включает в себя: smart, комбинированный или классический педикюр (На выбор), покрытие ногтевой пластины гель-лаком российского бренда Lui Philipp\n" +
                "\n" +
                "*Снятие гель-лака входит в стоимость",
        105,
        2700,
        "Екатерина",
        R.drawable.ekaterina
    )
)
val SalesData = listOf(
    AppotionData(
        "КОМБИНИРОВАННЫЙ | КЛАССИЧЕСКИЙ МАНИКЮР +" +
                "ВЫРАВНИВАНИЕ ПРИ ПОКРЫТИИ LUI PHILIPP",
        "Услуга включает в себя: комбинированный или классический маникюр (на выбор), выравнивание ногтевой пластины базой и однотонное покрытие гель-лаком российского бренда Lui Philipp\n" +
                "\n" +
                "\uFEFF*Снятие гель-лака входит в стоимость\n" +
                "\uFEFF*Снятие геля, полигеля, фаст геля - 400 рублей",
        120,
        1900,
        "Мария",
        R.drawable.maria
    ),
    AppotionData(
        "КОМБИНИРОВАННЫЙ | КЛАССИЧЕСКИЙ МАНИКЮР +" +
                "ВЫРАВНИВАНИЕ ПРИ ПОКРЫТИИ LUXIO",
        "Услуга включает в себя: комбинированный или классический маникюр (на выбор), выравнивание ногтевой пластины базой и однотонное покрытие гель-лаком Luxio\n" +
                "\n" +
                "\uFEFF*Снятие гель-лака входит в стоимость\n" +
                "\uFEFF\uFEFF*Снятие геля, полигеля, фаст геля - 400 рублей",
        120,
        2100,
        "Екатерина",
        R.drawable.ekaterina
    ),
    AppotionData(
        "КОМБИНИРОВАННЫЙ МАНИКЮР + УКРЕПЛЕНИЕ НОГТЕЙ ТВЕРДЫМ ГЕЛЕМ ПРИ ПОКРЫТИИ LUXIO",
        "Услуга включает в себя: комбинированный маникюр, ремонт трещин и укрепление ногтей гелем, что позволяет укрепить ногтевую пластину, скрыть недостатки, придать ногтям ухоженный вид с идеально ровными бликами и обеспечить носку без повреждений и однотонное покрытие гель-лаком бренда Luxio\n" +
                "\n" +
                "*Снятие гель-лака входит в стоимость",
        120,
        2900,
        "Мария",
        R.drawable.maria
    ),
)