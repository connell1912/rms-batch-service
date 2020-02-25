import React, { SyntheticEvent, useState } from "react";
import { Form, FormGroup, Label, Col, Input, Button } from "reactstrap";
import { Link } from "react-router-dom";

interface ILoginProps {
  updateCurrentUser: (username: string, password: string) => void;
  loginMessage: string;
}

export const LoginComponent:React.FC<any> = (props:ILoginProps) => {
    const [username, setUsername] = useState('');
    const [password, setPassword] = useState('');

    const submitLogin  = async (event: SyntheticEvent) => {
        event.preventDefault()
        props.updateCurrentUser(username, password)
    }

    return (
        <>
        <div className="loginDiv">
        <h2>Login</h2>
                <Form className="loginForm" onSubmit={submitLogin}>
                    <FormGroup row>
                        <Label for="username" sm={2}>Username</Label>
                        <Col sm={10}>
                            <Input required
                                type="text"
                                name="username"
                                id="username"
                                value={username}
                                placeholder="Username"
                                onChange={val=>setUsername(val.target.value)} />
                            {/* this is an example of data binding,
                            we take data from the state and put it
                            in our tsx */}
                        </Col>
                    </FormGroup>
                    <FormGroup row>
                        <Label for="password" sm={2}>Password</Label>
                        <Col sm={10}>
                            <Input required
                                type="password"
                                name="password"
                                id="password"
                                value={password}
                                placeholder="Password"
                                onChange={val=>setPassword(val.target.value)}/>
                        </Col>
                    </FormGroup>
                    <Button outline id="submitButton" color='secondary' type="submit">Login</Button>
                </Form>
                {/* <p>{props.loginMessage}</p> */}
                <br></br>
                <Link to="/Register">Create an Account</Link>
                </div>
            </>
    )

}
