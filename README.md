# JunoRxTask
Pадание для провеки уровня владением RxJava
---
Ход выполнения:
1. Склонировать этот репозиторий
2. Реализовать поведение описанное в классах TaskOneActivity и TaskTwoActivity
3. Закоммитить решение и запушить в свой репозиторий на своем аккаунте
4. Скинуть ссылку на репозиторий на почту hello@junohunt.ru

## Задачи
### TaskOne
---
Реализуйте следующее поведение:
При вводе любых слов в act_main_query_et, если 2 секунды не было изменений, показывается прогресс.
после прогресса через 3 секунды в act_main_answers_tv в столбик выводятся все слова из act_main_query_et разделенные пробелом и прогресс скрывается

![task1](https://github.com/JunoHunt/JunoRxTask/blob/master/examples/Task1.gif)

### TaskTwo
---
Реализовать следующее поведение:
 Кнопка act_task_two_login_btn становиться активной только если:
 текст из act_task_two_email_et проходит проверку isEmailValid
 и текст из act_task_two_password_et проходит проверку isPasswordValid
 Дополнительно: показывать ошибку в случае если поле не проходит проверку
 
![task2](https://github.com/JunoHunt/JunoRxTask/blob/master/examples/Task2.gif)
