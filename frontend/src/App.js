import {
  Routes, Route
} from 'react-router-dom';
import './App.css';
import NavBar from './components/Nav/NavBar'

import Home from './pages/Home/Home'
import About from './pages/About/About'
import Activities from './pages/Activities/Activities'
import Rates from './pages/Rates/Rates'
import Reserve from './pages/Reserve/Reserve'
import Contact from './pages/Contact/Contact'

function App() {
  return (
    <div className="App">
      <nav>
          <NavBar />
          <Routes>
            
            <Route path="about" element={ <About/> } />
            <Route path="activities" element={ <Activities /> } />
            <Route path="rates" element={ <Rates /> } />
            <Route path="reserve" element={ <Reserve/> } />
            <Route path="contact" element={ <Contact /> } />
          </Routes>
      </nav>
      <div className="home-page" id='home'>
        <Home />
      </div>

    </div>
  );
}

export default App;
