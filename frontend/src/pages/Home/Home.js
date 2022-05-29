import React from 'react'
import "./Home.css"
import About from '../About/About'
import Activities from '../Activities/Activities'
import Rates from '../Rates/Rates'
import Contact from '../Contact/Contact'
import SearchBar from '../../components/SearchBar/SearchBar'

export default function Home() {
  //TODO: Insert weather api
  
  return (
    <div className="home-content">
      <div className='home'>
        <SearchBar />
        <div className="main-content">
        <h2>welcome to evergreen grove</h2>
        <p>enjoy fresh air and foresty hikes to Lake Michigan beaches </p>
      
        </div>
      </div>

      <div className="feature-bar">
        <div className="feature-one">
          <img src="./assets/icons/forest-icon.svg" alt="tree icon" />
          <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Nisi eligendi.</p>
        </div>
        <div className="feature-two">
          <img src="./assets/icons/swim-icon.svg" alt="swimming icon" className="swim-icon" />
          <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Nisi eligendi.</p>
        </div>
        <div className="feature-three">
          <img src="./assets/icons/EV-icon.svg" alt="electric vehicle charing icon" className="ev-icon" />
          <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Nisi eligendi.</p>
        </div>
        <div className="feature-four">
          <img src="./assets/icons/pets-icon.svg" alt="pets allowed icon" className="pets-icon" />
          <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Nisi eligendi.</p>
        </div>
        <div className="feature-five">
          <img src="./assets/icons/plug-icon.svg" alt="electricity icon" className="electric-icon" />
          <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Nisi eligendi.</p>
        </div>


      </div>
      <div id="about"className="about-page">
          <About />
        </div>

        <div className="activities-page" id='activities'>
          <Activities />
        </div>


        <div className="rates-page" id='rates'>
          <Rates />
        </div>
        <div className="contact-page" id="contact">
          <Contact />
        </div>


    </div>
  )
}
