import axios from "axios";

export default class QuestionService{
    getQuestions(){
        return axios.get("http://localhost:8080/api/questions/getAll")
    }

    getQuestionById(){
        return axios.get("http://localhost:8080/api/questions/getById?id=")
    }


}
