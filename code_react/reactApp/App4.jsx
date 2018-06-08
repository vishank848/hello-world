import React from 'react';

class App4 extends React.Component {
    constructor() {
        super();

        this.state = {
            data: []
        }

        this.setStateHandler = this.setStateHandler.bind(this);
        this.clear = this.clear.bind(this);
    };
    clear() {
        alert(0);
    }
    setStateHandler() {
        var item = "setState..."
        var myArray = this.state.data.slice();
        myArray.push(item);
        this.setState({ data: myArray })
    };
    render() {
        return (
            <div>
                <button onClick={this.setStateHandler}>SET STATE</button>
                <button onClick={this.clear}>Clear</button>
                <h4>State Array: {this.state.data}</h4>
            </div>
        );
    }
}
export default App4;