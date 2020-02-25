import React, { useState } from "react";
import { Form, FormGroup, Label, Col, Input, Button } from "reactstrap";
import { addUser } from "../../utility/api";
import { Link } from "react-router-dom";

export const RegisterComponent: React.FC<any> = (props: any) => {
  const [username, setUsername] = useState("");
  const [password, setPassword] = useState("");
  const [roles, setRoles] = useState();

  return (
    <>
      <div className="registerDiv">
        <h2>Create an Account</h2>
        <Form
          className="loginForm"
          onSubmit={() =>
            addUser({
              userId: 0,
              username: username,
              password: password,
              employeeId: 0,
              roles: roles
            }).then(r => console.log(r.data))
          }
        >
          <FormGroup row>
            <Label for="username" sm={2}>
              Username
            </Label>
            <Col sm={10}>
              <Input
                required
                type="text"
                name="username"
                id="username"
                placeholder="Username"
                onChange={val => setUsername(val.target.value)}
              />
              {/* <FormFeedback valid tooltip>Username is available!</FormFeedback>
                <FormFeedback invalid tooltip>Username is unavailable, please select another.</FormFeedback> */}
            </Col>
          </FormGroup>
          <FormGroup row>
            <Label for="password" sm={2}>
              Password
            </Label>
            <Col sm={10}>
              <Input
                required
                type="password"
                name="password"
                id="password"
                placeholder="Password"
                onChange={val => setPassword(val.target.value)}
              />
            </Col>
          </FormGroup>
          {/* <FormGroup row>
              <Label for="confirmPassword" sm={2}>
                Confirm Password
              </Label>
              <Col sm={10}>
                <Input
                  required
                  type="password"
                  id="confirm_password"
                  name="confirm_password"
                  placeholder="Confirm Password"
                />
              </Col>
            </FormGroup> */}
          <FormGroup row>
            <Label for="roles" sm={2}>
              Role
            </Label>
            <Col sm={10}>
              <Input
                type="select"
                name="select"
                id="exampleSelect"
                onChange={val => setRoles(val.target.value)}
              >
                <option selected disabled>
                  Select a role
                </option>
                <option>Training Manager</option>
                <option>Building Manager</option>
                <option>Trainer</option>
                <option>Locked</option>
              </Input>
            </Col>
          </FormGroup>
          <Button color="btn btn-outline-secondary" type="submit">
            Submit
          </Button>
        </Form>
        <br />
        <Link to="/">Home</Link>
      </div>
    </>
  );
};

export default RegisterComponent;
