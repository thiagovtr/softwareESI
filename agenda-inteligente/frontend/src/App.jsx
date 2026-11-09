import PaginaProfissional from './Paginas/PaginaProfissional.jsx'
import PaginaAgendamento from './Paginas/PaginaAgendamento.jsx'
const obterRota = () => window.location.pathname
export default function App() { const rota = obterRota(); if (rota.startsWith('/agendar/')) return <PaginaAgendamento slug={rota.split('/')[2]} />; return <PaginaProfissional /> }
