import React, {useEffect, useState} from 'react';
import {Button, Checkbox, Container, Form, Icon, Table} from 'semantic-ui-react'
import QuestionService from "../services/questionService";

const Question = () => {
    const [value, setValue] = React.useState('this')


    const [question, setQuestion] = useState({})

    useEffect(() => {
        let questionService = new QuestionService()
        questionService.getQuestion().then(result => {
            setQuestion(result.data.data)
            console.log("question:", result.data.data);
        })


    }, [])



    return (
        <div>
            <Form>
                <Table basic>
                    <Table.Header>
                        <Table.Row>
                            <Table.HeaderCell>QUESTION 1</Table.HeaderCell>
                        </Table.Row>
                    </Table.Header>
                    <Table.Body>


                        <Container
                        >
                            <p>
                                {question.question}
                            </p>


                            <Checkbox
                                radio
                                label={question.optionA}
                                name='checkboxRadioGroup'
                                value='a'
                                checked={value === 'a'}
                                onChange={(e, data) => setValue(data.value)}
                            />

                            <Checkbox
                                radio
                                label={question.optionB}
                                name='checkboxRadioGroup'
                                value='b'
                                checked={value === 'b'}
                                onChange={(e, data) => setValue(data.value)}
                            />

                            <Checkbox
                                radio
                                label={question.optionC}
                                name='checkboxRadioGroup'
                                value='c'
                                checked={value === 'c'}
                                onChange={(e, data) => setValue(data.value)}
                            />


                            <Checkbox
                                radio
                                label={question.optionD}
                                name='checkboxRadioGroup'
                                value='d'
                                checked={value === 'd'}
                                onChange={(e, data) => setValue(data.value)}
                            />


                            <Checkbox
                                radio
                                label={question.optionE}
                                name='checkboxRadioGroup'
                                value='e'
                                checked={value === 'e'}
                                onChange={(e, data) => setValue(data.value)}
                            />


                        </Container>


                    </Table.Body>
                </Table>

                <Button icon labelPosition='right'>
                    İLERİ
                    <Icon name='right arrow'/>
                </Button>
            </Form>
        </div>
    );
};
export default Question;