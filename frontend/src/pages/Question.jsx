import React from 'react';
import {Button, Checkbox, Icon, Table, Form, Input} from 'semantic-ui-react'
import { useState, useEffect } from 'react'
import QuestionService from "../services/questionService";
import { Container } from 'semantic-ui-react'
import { useParams } from 'react-router-dom'

const Question = () => {
    const [value, setValue] = React.useState('this')



    // let { id } = useParams()


    const [question, setQuestion] = useState({})

    useEffect(() => {
        let questionService = new QuestionService()
        questionService.getQuestionById().then(result => {
            setQuestion(result.data.data)
            console.log("question:", result.data.data);
        })



    }, [])



    // const [questions, setQuestions] = useState([])
    //
    // useEffect(() => {
    //     let questionService = new QuestionService()
    //     questionService.getQuestions().then(result => setQuestions(result.data.data))
    //
    //
    //
    // }, [])








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

                        {/*{ questions.map(question => (*/}



                            <Container
                                // key={question.id}
                            >
                                <p>
                                    {question.question}
                                </p>


                                    <Checkbox
                                        radio
                                        label="{question.optionA}"
                                        name='checkboxRadioGroup'
                                        value='a'
                                        checked={value === 'a'}
                                        onChange={(e, data) => setValue(data.value)}
                                    />

                                <Checkbox
                                    radio
                                    label="{question.optionB}"
                                    name='checkboxRadioGroup'
                                    value='b'
                                    checked={value === 'b'}
                                    onChange={(e, data) => setValue(data.value)}
                                />

                                <Checkbox
                                    radio
                                    label="{question.optionC}"
                                    name='checkboxRadioGroup'
                                    value='c'
                                    checked={value === 'c'}
                                    onChange={(e, data) => setValue(data.value)}
                                />


                                <Checkbox
                                    radio
                                    label="{question.optionD}"
                                    name='checkboxRadioGroup'
                                    value='d'
                                    checked={value === 'd'}
                                    onChange={(e, data) => setValue(data.value)}
                                />


                                <Checkbox
                                    radio
                                    label="{question.optionE}"
                                    name='checkboxRadioGroup'
                                    value='e'
                                    checked={value === 'e'}
                                    onChange={(e, data) => setValue(data.value)}
                                />




                            </Container>





                        ))

                        }



                    </Table.Body>
                </Table>
                {/*<Form.Field>*/}
                {/*    /!*Selected value: <b>{value}</b>*!/*/}
                {/*</Form.Field>*/}
                {/*<Form.Field>*/}
                {/*    <Checkbox*/}
                {/*        radio*/}
                {/*        label="s"*/}
                {/*        name='checkboxRadioGroup'*/}
                {/*        value='a'*/}
                {/*        checked={value === 'a'}*/}
                {/*        onChange={(e, data) => setValue(data.value)}*/}
                {/*    />*/}
                {/*</Form.Field>*/}
                {/*<Form.Field>*/}
                {/*    <Checkbox*/}
                {/*        radio*/}
                {/*        label=''*/}
                {/*        name='checkboxRadioGroup'*/}
                {/*        value='b'*/}
                {/*        checked={value === 'b'}*/}
                {/*        onChange={(e, data) => setValue(data.value)}*/}
                {/*    /> </Form.Field>*/}
                {/*<Form.Field>*/}
                {/*    <Checkbox*/}
                {/*        radio*/}
                {/*        label=''*/}
                {/*        name='checkboxRadioGroup'*/}
                {/*        value='c'*/}
                {/*        checked={value === 'c'}*/}
                {/*        onChange={(e, data) => setValue(data.value)}*/}
                {/*    />*/}
                {/*</Form.Field>*/}
                {/*<Form.Field>*/}
                {/*    <Checkbox*/}
                {/*        radio*/}
                {/*        label=''*/}
                {/*        name='checkboxRadioGroup'*/}
                {/*        value='d'*/}
                {/*        checked={value === 'd'}*/}
                {/*        onChange={(e, data) => setValue(data.value)}*/}
                {/*    />*/}
                {/*</Form.Field>*/}
                {/*<Form.Field>*/}
                {/*    <Checkbox*/}
                {/*        radio*/}
                {/*        label=''*/}
                {/*        name='checkboxRadioGroup'*/}
                {/*        value='e'*/}
                {/*        checked={value === 'e'}*/}
                {/*        onChange={(e, data) => setValue(data.value)}*/}
                {/*    />*/}
                {/*</Form.Field>*/}
                <Button icon  labelPosition='right'>
                    İLERİ
                    <Icon name='right arrow'/>
                </Button>
            </Form>
        </div>
    );
};
export default Question;