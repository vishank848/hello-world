import React from 'react';

class App0 extends React.Component {
   render() {
      return (
         <div>
            <h1>{this.props.headerProp}</h1>
            <h2>{this.props.contentProp}</h2>
         </div>
      );
   }
}
App0.defaultProps = {
    headerProp: "Header from props...",
    contentProp:"Content from propsss..."
}
export default App0;