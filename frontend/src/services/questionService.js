import axios from "axios";

export default class QuestionService {
    getQuestions() {
        return axios.get("http://localhost:8080/api/questions/getAll")
    }

    getQuestion() {
        return axios.get("http://localhost:8080/api/questions/getQuestion?category=java&level=easy")
    }


}
