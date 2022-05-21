import {
  Routes, Route
} from 'react-router-dom';
import './App.css';
import NavBar from './components/Nav/NavBar'


import Reserve from './pages/Reserve/Reserve'
import Contact from './pages/Contact/Contact'
import Home from './pages/Home/Home'

function App() {
  return (
    <div className="App">
      <nav>
          <NavBar />
          <Routes>
            <Route exact path='/' element={<Home />}/>
            <Route path="reserve" element={ <Reserve/> } />
            <Route path="contact" element={ <Contact /> } />
          </Routes>
      </nav>


    </div>
  );
}

export default App;
